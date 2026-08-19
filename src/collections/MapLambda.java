package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapLambda {
    static void main() {

        // computeIfAbsent() method ucun namuna

        List<String> strings = List.of("yak", "du", "se", "cor", "panj", "wiw", "haft");
        Map<Integer, List<String>> map = new HashMap<>();
        for (String word : strings) {
            int length = word.length();
            map.computeIfAbsent(length, key -> new ArrayList<>())
                    .add(word);;
        }

        map.forEach((key, value) -> IO.println(key + " :: " + value));
    }
}
