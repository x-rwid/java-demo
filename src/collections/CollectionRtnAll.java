package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionRtnAll {
    static void main() {

        Collection<String> strings = new ArrayList<>();
        strings.add("yak");
        strings.add("du");
        strings.add("se");

        Collection<String> toBeRetained = new ArrayList<>();
        toBeRetained.add("yak");
        toBeRetained.add("cor");

        boolean hasChanged = strings.retainAll(toBeRetained);

        IO.println("String'lar o'zgarganmi? " + hasChanged);
        IO.println("string'lar = " +  strings);
    }
}
