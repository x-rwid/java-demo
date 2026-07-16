package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FIPredicate {
    static void main() {
        // Predicate Interface'ni Collection'ga uzatiw

        List<String> immutableStrings = List.of("yak", "du", "se", "cor", "pay");
        List<String> strings = new ArrayList<>(immutableStrings);
        Predicate<String> isEvenLength = s -> s.length() % 2 == 0;
        strings.removeIf(isEvenLength);
        IO.println("string'lar = " + strings);
    }
}
