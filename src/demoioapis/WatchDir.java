package demoioapis;

import java.nio.file.*;
import static java.nio.file.StandardWatchEventKinds.*;
import java.nio.file.attribute.*;
import java.io.*;
import java.util.*;

/**
 *  File'lardagi uzgariwlarni directory (yo tree)da kuzatiwga example.
 */

public class WatchDir {

    private final WatchService watcher;
    private final Map<WatchKey, Path> keys;
    private final boolean recursive;
    private boolean trace = false;

    @SuppressWarnings("unchecked")
    static <T> WatchEvent<T> cast(WatchEvent<?> event) {
        return (WatchEvent<T>) event;
    }

    /**
     * Berilgan directory'ni WatchService ila register'law.
     */
    private void register(Path dir) throws IOException {
        WatchKey key = dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
        if (trace) {
            Path prev = keys.get(key);
            if (prev == null) {
                System.out.format("register: %s\n", dir);
            } else {
                if (!dir.equals(prev)) {
                    System.out.format("update: %s -> %s\n", prev, dir);
                }
            }
        }
        keys.put(key, dir);
    }

    /**
     * Berilgan directory'ni va uni hamma subdirectory'larini WatchService ila register'law.
     */
    private void registerAll(final Path start) throws IOException {
        // directory va subdirectory'larni register'law
        Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                    throws IOException {
                register(dir);
                return FileVisitResult.CONTINUE;
            }
        });
    }

    /**
     * WatchService tuzadi va berilgan directory'ni register'laydi.
     */
    WatchDir(Path dir, boolean recursive) throws IOException {
        this.watcher = FileSystems.getDefault().newWatchService();
        this.keys = new HashMap<WatchKey, Path>();
        this.recursive = recursive;

        if (recursive) {
            System.out.format("Scanning %s ...\n", dir);
            registerAll(dir);
            IO.println("Done.");
        } else {
            register(dir);
        }

        // dastlabki registration'dan keyin trace'ni yoqiw
        this.trace = true;
    }

    /**
     * Watcher'ga navbatdagi kalitlar ucun hamma event'larni process'law.
     */
    void processEvents() {
        for (; ; ) {

            // kalit signal'laniwini kutiw
            WatchKey key;
            try {
                key = watcher.take();
            } catch (InterruptedException x) {
                return;
            }

            Path dir = keys.get(key);
            if (dir == null) {
                System.err.println("WatchKey tanilmadi!!");
                continue;
            }

            for (WatchEvent<?> event : key.pollEvents()) {
                WatchEvent.Kind kind = event.kind();

                // hal etiliwi kerak - OVERFLOW event'ga qanday iwlov beriliwiga example
                if (kind == OVERFLOW) {
                    continue;
                }

                // directory entry event ucun context bu entry'ni filename'i
                WatchEvent<Path> ev = cast(event);
                Path name = ev.context();
                Path child = dir.resolve(name);

                // print out event
                System.out.format("%s: %s\n", event.kind().name(), child);

                // directory tuzilsa va recursive kuzatilsa, uni va subdirectory'larini register'law
                if (recursive && (kind == ENTRY_CREATE)) {
                    try {
                        if (Files.isDirectory(child, LinkOption.NOFOLLOW_LINKS)) {
                            registerAll(child);
                        }
                    } catch (IOException x) {
                        // sample'ni o'qiliwini saqlaw ucun ignore'law
                    }
                }
            }

            // directory endi mavjud bulmasa, kalitni reset'law va set'dan olib tawlaw
            boolean valid = key.reset();
            if (!valid) {
                keys.remove(key);

                // hamma directory'larga kiriw imkansiz
                if (keys.isEmpty()) {
                    break;
                }
            }
        }
    }

    static void usage() {
        System.err.println("usage: java WatchDir [-r] dir");
        System.exit(-1);
    }

    static void main(String[] args) throws IOException {
        // argument'larni parse'law
        if (args.length == 0 ||
                (args.length == 2 && !args[0].equals("-r")) ||
                args.length > 2) {
            usage();
        }
        boolean recursive = false;
        int dirArg = 0;
        if (args[0].equals("-r") && args.length == 2) {
            recursive = true;
            dirArg++;
        }

        // directory'ni register'law va uni event'larini process'law
        Path dir = Paths.get(args[dirArg]);
        new WatchDir(dir, recursive).processEvents();
    }
}
