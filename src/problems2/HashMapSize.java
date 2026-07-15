package problems2;

import java.util.HashMap;
import java.util.Map;

public class HashMapSize {
    static void main() {

        HashMap<String,Integer> userAges = new HashMap<>();

        userAges.put("Xurwid",36);
        userAges.put("Ali",33);

        for (Map.Entry<String, Integer> entry : userAges.entrySet()) {
            IO.println("Kalit: " + entry.getKey() + ", Qiymat: " + entry.getValue());
        }

        IO.println("HashMap'dagi jami element'lar: " + userAges.size());
    }
}
