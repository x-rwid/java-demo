package arrays;

import java.util.Arrays;

public class ArrNumSum {
    static void main() {
        // 1D Array - uni yig'indisini hisablaw

        int[] moreNumbers = {45, 23, 67, 12, 89, 34};
        int total = 0;
        for (int num : moreNumbers) {
            total += num;
        }
        IO.println(""); // bo'w joy ucun
        IO.println("Ikkinci array: " + Arrays.toString(moreNumbers));
        IO.println("Ikkinci array'ni jamisi: " + total);
    }
}
