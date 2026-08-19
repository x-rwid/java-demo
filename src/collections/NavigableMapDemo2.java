package collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo2 {
    static void main() {

        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(2, "du");
        map.put(4, "cor");
        map.put(6, "wiw");

        IO.println("Map: " + map);

        NavigableMap<Integer, String> subMap = map.subMap(2, true, 4, true);
        IO.println("Submap 2 dan 4 gaca: " + subMap);
        IO.println("3 qo'wiw");
        map.put(3, "se");
        IO.println("Submap 2 dan 4 gaca: " + subMap);

        NavigableMap<Integer, String> headMap = map.headMap(4, true);
        IO.println("Headmap 4 da bowlanadi: " + headMap);
        IO.println("5 qo'wiw");
        map.put(5, "panj");
        IO.println("Headmap 4 da bowlanadi: " + headMap);

        NavigableMap<Integer, String> tailMap = map.tailMap(2, true);
        IO.println("Tailmap 2 gaca: " + tailMap);
        IO.println("1 qo'wiw");
        map.put(1, "yak");
        IO.println("Tailmap 2 gaca: " + tailMap);
    }
}
