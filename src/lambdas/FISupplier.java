package lambdas;

import java.util.Random;
import java.util.function.Supplier;

public class FISupplier {
    static void main() {
        // Supplier Interface

        Random random = new Random(314L);
        Supplier<Integer> newRandom = () -> random.nextInt(10);

        for (int index = 0; index < 5; index++) {
            IO.println(newRandom.get() + " ");
        }
    }
}
