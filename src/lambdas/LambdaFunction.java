package lambdas;

import java.util.function.Function;

public class LambdaFunction {
    static void main() {
        // Function biron narsani oladi, bowqa narsani qaytaradi

        Function<String, Integer> getLength = s -> s.length();
        IO.println("Duke'ni uzunligi: " + getLength.apply("Duke"));
    }
}
