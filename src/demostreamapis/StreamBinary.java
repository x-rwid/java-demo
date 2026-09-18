package demostreamapis;

import java.util.List;
import java.util.function.BinaryOperator;

public class StreamBinary {
    static void main() {

        List<Integer> ints = List.of(3, 6, 2, 1);

        BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;

        int result = ints.get(0);
        for (int index = 1; index < ints.size(); index++) {
            result = max.apply(result, ints.get(index));
        }
        IO.println("Max = " + result);
    }
}
