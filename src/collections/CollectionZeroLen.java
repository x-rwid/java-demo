package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionZeroLen {
    static void main() {

        Collection<String> strings = List.of("yak", "du");

        String[] zeroLengthTab = {};
        String[] result = strings.toArray(zeroLengthTab);

        IO.println("0 uzunlikdagi jadval = " + Arrays.toString(zeroLengthTab));
        IO.println("natija = " +  Arrays.toString(result));
    }
}
