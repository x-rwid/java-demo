package lambdas;

import java.util.List;

public class CollectionConsumer {
    static void main() {
        // Consumer orqali collection element'larini birma bir cop etiw

        var animals = List.of("tulpor", "locin", "kit", "ari");
        animals.forEach(animal -> IO.println(animal));
    }
}
