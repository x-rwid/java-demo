package collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapLambda2 {
    static void main() {

        /*
        merge() method 3 ta argument oladi:
        1. kalit
        2. bu kalitga bog'law kerak bo'lgan qiymat
        3. remapping BiFunction
         */

        List<String> strings = List.of("yak", "du", "se", "cor", "panj", "wiw", "haft");
        Map<Integer, String> map = new HashMap<>();
        for (String word : strings) {
            int length = word.length();
            map.merge(length, word,
                    (existingValue, newWord) -> existingValue + ", " + newWord);
        }

        map.forEach((key, value) -> IO.println(key + " :: " + value));
    }
}
