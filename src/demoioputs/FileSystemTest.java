package demoioputs;

import java.nio.file.*;

public class FileSystemTest {
    static void main() {

        FileSystem fileSystem = FileSystems.getDefault();
        for (FileStore store : fileSystem.getFileStores()) {
            IO.println(store.name() + " - " + store.type());
        }

        for (Path directory : fileSystem.getRootDirectories()) {
            boolean readable = Files.isDirectory(directory);
            IO.println("directory = " + directory + " - " + readable);
        }
    }
}
