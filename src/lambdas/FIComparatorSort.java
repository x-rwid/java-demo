package lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FIComparatorSort {
    static void main() {

        /*
        Character'lar string'ini ularni uzunligi ila,
        keyin ularni tabiiy tartibi ila taqqoslaw.
        O'qiw qulayligini yanada owiriw maqsadida
        naturalOrder() method ucun static import'dan foydalanildi.
         */

        Comparator<String> byLengthThenAlphabetically =
                Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder());

        List<String> strings = Arrays.asList("yak", "du", "se", "cor", "pay");
        strings.sort(byLengthThenAlphabetically);
//        strings.sort(byLengthThenAlphabetically.reversed()); // ruyxatni teskari ugiriw
        IO.println(strings);
    }
}
