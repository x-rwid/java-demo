package lambdas;

import java.util.ArrayList;
import java.util.List;

public class CollectionPredicate {
    static void main() {
        // Predicate orqali list'dan element'larni tanlab olib tawlaw

        var animals = List.of("tulpor", "locin", "kit", "ari", "kiyik");
        // animals'ni o'zgartiriw mumkin bo'lgan holga keltiriw
        animals = new ArrayList<>(animals);

        IO.println(animals);
        animals.removeIf(animal -> animal.startsWith("k"));
        IO.println(animals);
    }
}
