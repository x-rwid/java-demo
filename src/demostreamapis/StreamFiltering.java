package demostreamapis;

import java.util.List;

public class StreamFiltering {
    static void main() {

        List<String> strings = List.of("yak", "du", "se", "cor");

        long count = strings.stream()
                .map(String::length)
                .filter(length -> length == 3)
                .count();

        IO.println("sanoq = " + count);
    }
}
