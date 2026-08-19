package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapLambda4 {
    static void main() {

        /*
        List'lar element'larini guruhlaw ucun
        map.computeIfAbsent() method'dan foydalaniw
         */

        // so'zlarni uzunligi bo'yica guruhlaw
        List<String> words = List.of(
                "java", "python", "go", "rust",
                "c++", "swift", "kotlin");
        Map<Integer, List<String>> wordsByLength = new HashMap<>();

        for (String word : words) {
            wordsByLength
                    .computeIfAbsent(word.length(), _ -> new ArrayList<>()).add(word);
        }

        IO.println("Uzunlik bo'yica guruhlangan so'zlar:");
        wordsByLength.forEach((length, wordList) ->
                IO.println(" " + length + " harf: " + wordList));
    }
}
