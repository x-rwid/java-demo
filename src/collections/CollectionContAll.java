package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionContAll {
    static void main() {

        Collection<String> strings = new ArrayList<>();
        strings.add("yak");
        strings.add("du");
        strings.add("se");

        Collection<String> first = new ArrayList<>();
        first.add("yak");
        first.add("du");

        Collection<String> second = new ArrayList<>();
        second.add("yak");
        second.add("cor");

        IO.println("Birinci string'larda bormi? " +  strings.containsAll(first));
        IO.println("Ikkinci string'larda bormi? " +  strings.containsAll(second));
    }
}
