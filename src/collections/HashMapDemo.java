package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    static void main() {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "anjir");
        map.put(2, "zaytun");
        map.put(null, "test");
        map.put(null, "test");

        for (Map.Entry m : map.entrySet()) {
            IO.println(m.getKey() + " : " + m.getValue());
        }
    }
}
