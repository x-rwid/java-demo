package problems;

import java.util.Arrays;

public class ArrSumAveMaxMIn {
    static void main() {
        // 1D Array - Array'ni Yig'indisini, O'rtacisini, Eng Kattasini, Eng Kicigini Hisablaw

        int[] values = {10, 20, 30};
        int summa = 0;
        int maximum = values[0];
        int minimum = values[0];


        for (int value : values) {
            summa += value;
            if (value > maximum) maximum = value;
            if (value < minimum) minimum = value;
        }
        double average = (double) summa / values.length;

        IO.println("Array: " + Arrays.toString(values));
        IO.println("Yig'indisi: " + summa);
        IO.println("O'rtacasi: " + average);
        IO.println("Eng kattasi: " + maximum);
        IO.println("Eng kicigi: " + minimum);
    }
}
