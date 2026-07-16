package lambdas;

import java.util.function.Consumer;

public class LambdaConsumer {
    static void main() {
        // Consumer biron narsani oladi, hec narsa qaytarmaydi

        Consumer<String> printer = s -> IO.println("Xabar: " + s);
        printer.accept("Duke Java'ni yoqtiradi.");
        printer.accept("Duke qahvani yoqtiradi.");
    }
}
