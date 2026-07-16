package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class FIUnaryOperator {
    static void main() {
        // Unary Operator'ni List'ga uzatiw

        List<String> strings = Arrays.asList("yak", "du", "se");
        UnaryOperator<String> toUpperCase = word -> word.toUpperCase();
        strings.replaceAll(toUpperCase);
        IO.println(strings);
    }
}
