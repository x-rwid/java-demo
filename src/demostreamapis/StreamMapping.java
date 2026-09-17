package demostreamapis;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMapping {
    static void main() {

        List<String> strings = List.of("yak", "du", "se", "cor");
        Function<String, Integer> toLength = String::length;

        Stream<Integer> ints = strings.stream().map(toLength);

        IO.println("Qayta iwlaw bajarildi.");
    }
}
