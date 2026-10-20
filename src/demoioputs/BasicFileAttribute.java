package demoioputs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttribute {
    static void main() throws IOException {

        Path file = Paths.get("D:/2. java/1. java start/12. ilk dastur/salamdunya/myfirstjavaapp.txt");
        BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);

        IO.println("creationTime: " + attr.creationTime());
        IO.println("lastAccessTime: " + attr.lastAccessTime());
        IO.println("lastModifiedTime: " + attr.lastModifiedTime());

        IO.println("isDirectory: " + attr.isDirectory());
        IO.println("isOther: " + attr.isOther());
        IO.println("isRegularFile: " + attr.isRegularFile());
        IO.println("isSymbolicLink: " + attr.isSymbolicLink());
        IO.println("size: " + attr.size());
    }
}
