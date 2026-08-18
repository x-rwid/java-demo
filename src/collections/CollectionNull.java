package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionNull {
    static void main() {

        Collection<String> strings = List.of("yak", "du");

        String[] largerTab = {"se", "se", "se", "man", "u yerda", "edim"};
        IO.println("kattaro jadval = " + Arrays.toString(largerTab));

        String[] result = strings.toArray(largerTab);
        IO.println("natija = " +  Arrays.toString(result));

        IO.println("Xuddi wu array'larmi? " + (result == largerTab));
    }
}
