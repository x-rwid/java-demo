package demoioapis;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathConvert {
    static void main() {

        Path p1 = Paths.get("/home/logfile");
        System.out.format("%s%n", p1.toUri());
    }
}
