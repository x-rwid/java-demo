package demostreamapis;

import java.util.Collection;
import java.util.List;

public class StreamFind {
    static void main() {

        Collection<String> strings =
                List.of("yak", "du", "se", "cor", "panj", "wiw", "haft");

        String first = strings.stream()
                // .unordered()
                // .parallel()
                .filter(s -> s.length() == 3)
                .findFirst()
                .orElseThrow();
        IO.println("birnci string = " + first);
    }
}
