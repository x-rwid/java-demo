package lambdas;

import java.util.ArrayList;
import java.util.List;

public class CollectionFunction {
    static void main() {

        /*
        Collection element'larini function ila o'zgartiriw mumkin,
        agar uwbu element'larni type'i o'zgartirilmasa
         */

        var animals = List.of("tulpor", "locin", "kit", "ari");
        // animals'ni o'zgartiriw mumkin bo'lgan holga keltiriw
        animals = new ArrayList<>(animals);

        IO.println(animals);
        animals.replaceAll(animal -> animal.toUpperCase());
        IO.println(animals);
    }
}
