package demostreamapis;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamMax {
    static void main() {

        Stream<String> strings = Stream.of("yak", "du", "se", "cor", "panj");
        String longest = strings.max(Comparator.comparing(String::length))
                .orElseThrow();
        IO.println("eng uzun string = " + longest);
    }
}
