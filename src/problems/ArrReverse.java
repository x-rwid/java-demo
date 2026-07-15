package problems;

import java.util.Arrays;

public class ArrReverse {
    static void main() {
        // Array'dagi qiymatlarni teskari ugiriw

        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reversed = reverseArray(original);

        for (int num : reversed) {
            IO.print(num + " ");
        }
    }

    public static int[] reverseArray(int[] array) {
        if (array.length == 0) {
            return new int[]{};
        }

        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - i - 1];
        }
        return newArray;
    }
}
