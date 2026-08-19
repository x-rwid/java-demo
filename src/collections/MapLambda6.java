package collections;

import java.util.HashMap;
import java.util.Map;

public class MapLambda6 {
    static void main() {

        // Namuna: Matnlardagi so'zlarni takrorini sanaw

        String[] sentence = {
                "the", "quick", "brown", "fox",
                "jumps", "over", "the", "lazy", "dog"};
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : sentence) {
            wordCount.merge(word, 1, Integer::sum);
        }

        IO.println("So'zlarni takrori:");
        wordCount.forEach(
                (word, count) ->
                        IO.println("'" + word + "': " + count));
    }
}
