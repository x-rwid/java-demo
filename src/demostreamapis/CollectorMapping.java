package demostreamapis;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorMapping {
    static void main() {

        Collection<String> strings = List.of("yak", "du", "se", "cor", "panj", "wiw", "haft");

        List<String> result = strings.stream()
                .collect(Collectors.mapping(String::toUpperCase, Collectors.toList()));

        IO.println("natija = " + result);
    }
}
