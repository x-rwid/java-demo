package demostreamapis;

import java.util.Collection;
import java.util.List;

public class StreamCount {
    static void main() {

        Collection<String> strings =
                List.of("yak", "du", "se", "cor", "panj", "wiw", "haft");

        long count = strings.stream()
                .filter(s -> s.length() == 4)
                .count();

        IO.println("sanoq = " + count);
    }
}
