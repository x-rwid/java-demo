package demostreamapis;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSet {
    static void main() {

        Stream<String> strings = Stream.of("yak", "du", "se", "cor");
        Set<String> result = strings.filter(s -> s.length() == 3)
                .map(String::toUpperCase)
                .collect(Collectors.toUnmodifiableSet());
        IO.println("natijani class'i = " + result.getClass());
        IO.println("natija = " + result);
    }
}
