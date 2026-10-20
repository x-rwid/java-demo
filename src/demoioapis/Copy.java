package demoioapis;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.EnumSet;

import static java.nio.file.FileVisitResult.CONTINUE;
import static java.nio.file.FileVisitResult.SKIP_SUBTREE;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * File'larni source directory'dan destination folder'ga recursive copy'alaydigan sample code.
 * Copy'alaw ucun directory level'larini maximum soni -depth dan keyin ko'rsatiladi.
 * Copy'alangan file'lar soni standard out'ga print qilinadi.
 * Ilovani ijro etiw ucun:
 * @code java Copy . new -depth 4
 */

public class Copy {

    /**
     * {@code FileVisitor}
     * belgilangan naqwga mos hamma file'larni topadi.
     */
    public static class Replicator
            extends SimpleFileVisitor<Path> {

        Path source;
        Path destination;
        long count = 0L;

        public Replicator(Path source, Path destination) {
            this.source = source;
            this.destination = destination;
        }

        // copy'alangan file'larni total sonini standard out'ga print qiliw
        void done() throws IOException {
            IO.println("Number of files copied: " + count);
        }

        // file'ni destination'da copy'alaw
        @Override
        public FileVisitResult visitFile(Path file,
                                         BasicFileAttributes attrs) {
            IO.println("Copy file: " + file);
            Path newFile = destination.resolve(source.relativize(file));
            try {
                // WARNING: COPY_ATTRIBUTES bazi attribute'larni warning'siz copy'alawni tuwirib qoldiriwi mumkin!
                Files.copy(file, newFile, COPY_ATTRIBUTES);
                count++;
            } catch (IOException ioException) {
                // uni log qiliw va kuciriw
            }
            return CONTINUE;
        }

        // directory'ni copy'asini caqiriw
        @Override
        public FileVisitResult preVisitDirectory(Path dir,
                                                 BasicFileAttributes attrs) {
            IO.println("Copy directory: " + dir);
            Path targetDir = destination.resolve(source.relativize(dir));
            try {
                // WARNING: COPY_ATTRIBUTES bazi attribute'larni warning'siz copy'alawni tuwirib qoldiriwi mumkin!
                Files.copy(dir, targetDir, REPLACE_EXISTING, COPY_ATTRIBUTES);
            } catch (IOException e) {
                System.err.println("Unable to create " + targetDir + " [" + e + "]");
                return SKIP_SUBTREE;
            }

            return CONTINUE;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            if (exc == null) {
                Path destination = this.destination.resolve(source.relativize(dir));
                try {
                    FileTime time = Files.getLastModifiedTime(dir);
                    Files.setLastModifiedTime(destination, time);
                } catch (IOException e) {
                    System.err.println("Unable to copy all attributes to: " + destination + " [" + e + "]");
                }
            } else {
                throw exc;
            }

            return CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file,
                                               IOException exc) {
            if (exc instanceof FileSystemLoopException) {
                System.err.println("cycle detected: " + file);
            } else {
                System.err.format("Unable to copy:" + " %s: %s%n",
                        file, exc);
            }
            return CONTINUE;
        }
    }

    static void usage() {
        System.err.println("java Copy <source> <destination>" +
                " -depth \"<max_level_dir>\"");
        System.exit(-1);
    }

    static void main(String[] args)
            throws IOException {

        if (args.length < 4 || !args[2].equals("-depth"))
            usage();

        Path source = Paths.get(args[0]);
        Path destination = Paths.get(args[1]);
        int depth = Integer.parseInt(args[3]);

        Replicator walk = new Replicator(source, destination);
        EnumSet<FileVisitOption> opts = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
        Files.walkFileTree(source, opts, depth, walk);
        walk.done();
    }
}
