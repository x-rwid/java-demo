package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionRmvAll {
    static void main() {

        Collection<String> strings = new ArrayList<>();
        strings.add("yak");
        strings.add("du");
        strings.add("se");

        Collection<String> toBeRemoved = new ArrayList<>();
        toBeRemoved.add("yak");
        toBeRemoved.add("cor");

        boolean hasChanged = strings.removeAll(toBeRemoved);

        IO.println("String'lar o'zgarganmi? " + hasChanged);
        IO.println("string'lar = " + strings);
    }
}
