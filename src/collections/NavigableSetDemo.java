package collections;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetDemo {
    static void main() {

        NavigableSet<String> sortedStrings = new TreeSet<>((Set.of("a", "b", "c", "d", "e", "f")));
        IO.println("saralangan string'lar = " + sortedStrings);
        NavigableSet<String> reversedStrings = sortedStrings.descendingSet();
        IO.println("teskari string'lar = " + reversedStrings);
    }
}
