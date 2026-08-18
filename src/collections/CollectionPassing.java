package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionPassing {
    static void main() {

        Collection<String> strings = new ArrayList<>(); // collection'da 4 ta element bor
        strings.add("yak");
        strings.add("du");
        strings.add("se");
        strings.add("cor");

        String[] tabString1 = strings.toArray(new String[] {}); // bo'w array'ga uzatiw
        IO.println("Tab string 1: " + Arrays.toString(tabString1));
        String[] tabString2 = strings.toArray(new String[4]); // to'g'ri hajmdagi array'ga uzatiw
        IO.println("Tab string 2: " + Arrays.toString(tabString2));
    }
}
