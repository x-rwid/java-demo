package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    static void main() {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("null", 0);
        map.put("liman", 1);
        map.put("banan", 2);
        map.put("apelsin", 4);
        map.replace("apelsin", 3); // sonlarni almawtiriw

        for (Map.Entry m : map.entrySet()) {
            IO.println(m.getKey() + " : " + m.getValue()); // for-each loop'da cop etiw
        }
    }
}
