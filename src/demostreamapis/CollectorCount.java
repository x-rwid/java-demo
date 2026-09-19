package demostreamapis;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorCount {
    static void main() {

        Collection<String> strings = List.of("yak", "du", "se");

        long count = strings.stream().count();
        long countWithACollector = strings.stream().collect(Collectors.counting());

        IO.println("sanoq " + count);
        IO.println("Collector ila sanoq " + countWithACollector);
    }
}
