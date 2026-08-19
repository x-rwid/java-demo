package collections;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    static void main() {

        SortedSet<String> strings = new TreeSet<>(Set.of("a","b","c", "d","e", "f"));
        SortedSet<String> subSet = strings.subSet("aa","d");
        IO.println("sub set = " + subSet);
    }
}
