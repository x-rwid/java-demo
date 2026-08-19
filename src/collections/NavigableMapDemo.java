package collections;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableMapDemo {
    static void main() {

        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(1, "yak");
        map.put(2, "du");
        map.put(3, "se");
        map.put(4, "cor");
        map.put(5, "panj");

        map.keySet().forEach(key -> IO.print(key + " "));
        IO.println();

        NavigableSet<Integer> descendingKeys = map.descendingKeySet();
        descendingKeys.forEach(key -> IO.print(key + " "));
    }
}
