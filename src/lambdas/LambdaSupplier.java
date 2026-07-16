package lambdas;

import java.util.function.Supplier;

public class LambdaSupplier {
    static void main() {
        // Supplier hec qanday tortiwuvlarga qaramay, biron narsani qaytaradi

        Supplier<String> greeting = () -> "Duke Java'ni yoqtiradi";
        IO.println(greeting.get() + ", buni allaqacon aytgandikmi?");
    }
}
