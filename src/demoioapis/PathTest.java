package demoioapis;

import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    static void main(String[] args) {

        Path p1 = Paths.get("/tmp/foo");

        Path p2 = Paths.get(args[0]);

        Path p3 = Paths.get(URI.create("file:///Users/xurwid/FileTest.java"));

        Path p4 = FileSystems.getDefault().getPath("/users/rasuliy");

        Path p5 = Paths.get(System.getProperty("user.home"),"logs", "foo.log");

        Path debugFile = Path.of("/tmp/debug.log");
    }
}
