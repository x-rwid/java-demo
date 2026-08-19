package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionCopy {
    static void main() {

        Collection<String> strings = Arrays.asList("ya", "du", "se");

        List<String> list = List.copyOf(strings);
        IO.println("List: " + list);

        Set<String> set = Set.copyOf(strings);
        IO.println("Set: " + set);
    }
}

