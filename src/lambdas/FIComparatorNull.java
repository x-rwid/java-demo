package lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FIComparatorNull {
    static void main() {
        // Comparator interface'da null qiymatlar ila iwlaw

        List<String> strings = Arrays.asList("yak", "null", "du", "se", "null", "null", "cor", "pay");
        Comparator<String> naturalNullsLast = Comparator.nullsLast(Comparator.naturalOrder());
        strings.sort(naturalNullsLast);
        IO.println(strings);
    }
}
