package demostreamapis;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamCharSorted {
    static void main() {

        Predicate<Stream<?>> isSorted = stream ->
                ((stream.spliterator().characteristics() & Spliterator.SORTED) != 0);

        List<String> strings = List.of("yak", "du", "se", "cor", "panj");
        IO.println("strings saralanganmi? " + isSorted.test(strings.stream()));

        Stream<String> sortedStrings = strings.stream().sorted();
        IO.println("sortedStrings saralanganmi? " + isSorted.test(sortedStrings));

        Stream<String> filtered = strings.stream().sorted().filter(s -> s.length() < 5);
        IO.println("filtered saralanganmi? " + isSorted.test(filtered));

        Stream<Integer> lengths = strings.stream().sorted().filter(s -> s.length() < 5).map(String::length);
        IO.println("lengths saralanganmi? " + isSorted.test(lengths));
    }
}
