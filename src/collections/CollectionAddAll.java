package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionAddAll {
    static void main() {

        Collection<String> strings = new ArrayList<>();
        strings.add("yak");
        strings.add("du");
        strings.add("se");
        strings.add("cor");

        Collection<String> first = new ArrayList<>();
        first.add("yak");
        first.add("cor");

        boolean hasChanged = strings.addAll(first);

        IO.println("String'lar o'zgarganmi? " + hasChanged);
        IO.println("string'lar = " + strings);

        IO.println(); // bo'w joy tawlaw quyidagi namunani natijasi ajralib turiwi ucun

        // Collection'ni implementation class'i o'zgartirilsa, ArrayList HashSet ucun bowqaca natija beradi

        Collection<String> strings1 = new HashSet<>();
        strings1.add("yak");
        strings1.add("du");
        strings1.add("se");
        strings1.add("cor");

        Collection<String> first1 = new ArrayList<>();
        first1.add("yak");
        first1.add("cor");

        boolean hasChanged1 = strings1.addAll(first1);

        IO.println("String'lar o'zgarganmi? " + hasChanged1);
        IO.println("strings1 = " + strings1);
    }
}
