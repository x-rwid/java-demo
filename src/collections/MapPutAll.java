package collections;

import java.util.HashMap;
import java.util.Map;

public class MapPutAll {
    static void main() {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "yak");
        map.put(2, "du");
        map.put(3, "se");

        Map<Integer, String> otherMap = new HashMap<>();
        otherMap.put(2, "DU");
        otherMap.put(3, "SE");
        otherMap.put(4, "COR");

        IO.println("Map " + map);
        IO.println("Bowqa map " + otherMap);

        map.putAll(otherMap);

        IO.println("Map " + map);
        IO.println("Bowqa map " + otherMap);
    }
}
