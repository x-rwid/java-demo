package problems2;

import java.util.HashMap;
import java.util.Map;

public class HashMapMerge {

    public static void mergePrintAndClear(Map<Integer, String> map1, Map<Integer, String> map2) {
        Map<Integer, String> mergedMap = new HashMap<>(map1);
        mergedMap.putAll(map2);

        IO.println("Birlawtirilgan Xarita Qiymatlari:");
        for (String value : mergedMap.values()) {
            IO.println(value);
        }

        map1.clear();
        map2.clear();
        mergedMap.clear();
        IO.println("\nHamma to'plamlar tozalandi.");
    }

    static void main() {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(3, "C");
        map2.put(4, "D");
        mergePrintAndClear(map1, map2);
    }
}
