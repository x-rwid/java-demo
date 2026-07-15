package problems2;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapClone {
    static void main() {

        HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Hudud", 1);
        originalMap.put("Maydon", 2);
        IO.println("Asl Xarita: " + originalMap);

        HashMap<String, Integer> clonedMap = clonedMap(originalMap);
        IO.println("Nusxalangan Xarita: " + clonedMap);

        ArrayList<Integer> valueList = getValuesAsList(clonedMap);
        IO.println("Element'lar ArrayList sifatida: " + valueList);
    }

    @SuppressWarnings("tekwirilmagan")
    public static <K, V> HashMap<K, V> clonedMap(HashMap<K, V> sourceMap) {
        if (sourceMap == null) {
            return null;
        }
        return (HashMap<K, V>) sourceMap.clone();
    }

    public static <K, V> ArrayList<V> getValuesAsList(HashMap<K, V> map) {
        if (map == null) {
            return new ArrayList<>();
        }
        return new ArrayList<>(map.values());
    }
}
