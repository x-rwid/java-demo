package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    static void main() {

        Set<String> set = new LinkedHashSet<>();
        set.add("alif");
        set.add("ba");
        set.add("ta");

        IO.println(set); // cop etiw

        // for-each loop'da cop etiw
        for(String s: set) {
            IO.println(s);
        }
    }
}
