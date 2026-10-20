package demoioapis;

/**
 *
 * Belgilangan glob naqwiga mos file'larni topadigan sample code.
 * Glob naqwini tawkil etuvci narsa haqida ba tafsil info oliw ucun:
 * https://docs.oracle.com/javase/tutorial/essential/io/fileOps.html#glob
 * Naqwga mos file yo directory'lar standard out'ga print qilinadi.
 * Mosliklar soni ham print qilinadi.
 * Ilovani ijro etiwda glob naqwini qo'wtirnoq iciga oliw kerak, wunda shell wild card'larni kengaytirmaydi:
 * java Find . -name "*.java"
 */

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import static java.nio.file.FileVisitResult.*;
import java.util.*;

public class Find {

    public static class Finder
            extends SimpleFileVisitor<Path> {

        private final PathMatcher matcher;
        private int numMatches = 0;

        Finder(String pattern) {
            matcher = FileSystems.getDefault()
                    .getPathMatcher("glob:" + pattern);
        }

        // glob naqwini file yo directory nomi ila taqqoslaw
        void find(Path file) {
            Path name = file.getFileName();
            if (name != null && matcher.matches(name)) {
                numMatches++;
                IO.println(file);
            }
        }

        // moslarni total sonini standard out'ga print qiliw
        void done() {
            IO.println("Matched: "
                    + numMatches);
        }

        // har bir file'da pattern matching method'ini caqiriw
        @Override
        public FileVisitResult visitFile(Path file,
                                         BasicFileAttributes attrs) {
            find(file);
            return CONTINUE;
        }

        // har bir directory'da pattern matching method'ini caqiriw
        @Override
        public FileVisitResult preVisitDirectory(Path dir,
                                                 BasicFileAttributes attrs) {
            find(dir);
            return CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file,
                                               IOException exc) {
            System.err.println(exc);
            return CONTINUE;
        }
    }

    static void usage() {
        System.err.println("java Find <path>" +
                " -name \"<glob_pattern>\"");
        System.exit(-1);
    }

    static void main(String[] args)
            throws IOException {

        if (args.length < 3 || !args[1].equals("-name"))
            usage();

        Path startingDir = Paths.get(args[0]);
        String pattern = args[2];

        Finder finder = new Finder(pattern);
        Files.walkFileTree(startingDir, finder);
        finder.done();
    }
}
