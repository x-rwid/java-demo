package demostreamapis;

import java.util.List;
import java.util.stream.Stream;

public class StreamConsume {
    static void main() {

        Stream<String> strings = Stream.of("yak", "du", "se", "cor");

        List<String> result = strings.filter(s -> s.length() == 3)
                .map(String::toUpperCase)
                .toList();
        IO.println("natija = " + result);
    }
}
