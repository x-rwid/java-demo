package demostreamapis;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo {
    static void main() {

        List<String> strings = List.of("yak", "du", "se", "cor");

        var map = strings.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        map.forEach((key, value) -> IO.println(key + " :: " + value));
    }
}
