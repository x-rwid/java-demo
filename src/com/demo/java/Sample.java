package com.demo.java;

import java.nio.file.Files;
import java.nio.file.Path;

public class Sample {
    static void main() {
        // functional uslub

        try {
            final var filePath = "./Sample.java";
            final var wordOfInterest = "public";

            try (var stream = Files.lines(Path.of(filePath))) {
                long count = stream.filter(line -> line.contains(wordOfInterest)).count();

                IO.println(String.format("%s so'z ila %d satrlar topildi", count, wordOfInterest));
            }
        } catch (Exception ex) {
            IO.println("ERROR: " + ex.getMessage());
        }
    }
}
