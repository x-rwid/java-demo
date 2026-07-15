package wrappers;

import java.util.ArrayList;
import java.util.List;

public class UnboxingDemo {
    static void main() {
        // Unboxing

        Integer i = Integer.valueOf(-8);

        // 1. method caqiruv orqali qutidan ciqariw
        int absVal = absoluteValue(i);
        IO.println(i + " ni mutlaq qiymati" + " = " + absVal);

        List<Double> doubles = new ArrayList<>();
        doubles.add(3.1416); // pi method caqiruvi orqali be vasita qutiga solinadi

        // 2. tayinlaw orqali qutidan ciqariw
        double pi = doubles.get(0);
        IO.println("pi = " + pi);
    }

    public static int absoluteValue(int i) {
        return (i < 0) ?- i : i;
    }
}
