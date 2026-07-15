package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    static void main() {

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "test");
        map.put(1, "test");
        map.put(2, "test");

        IO.println(map.firstKey()); // avvalgi kalitni cop etiw
        IO.println(map.lastKey()); // oxirgi kalitni cop etiw
        IO.println(map.size()); // uzunligini cop etiw

        // for-each loop orqali cop etiw
        for (Map.Entry m : map.entrySet()) {
            IO.println(m.getKey() + " = " + m.getValue());
        }
    }
}
