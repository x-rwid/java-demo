package problems;
import java.util.Arrays;

public class ArrFindMinMax {
    /*
    Array'dagi eng kicik va eng katta element'larni izlaw.
    1ci element'i eng kicik bo'lgan 2 ta butun sonlar array'ini qaytariw,
    qiymat va 2ci element eng katta qiymat bo'lsin,
    agar kiriw array'i null yo bo'w bo'lsa, null qaytarsin.
     */
    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null; // bo'w yo null array case'larini iwlatiw
        }
        int min = arr[0]; // 1ci element ila eng min'ni iwga tuwiriw
        int max = arr[0]; // 1ci element ila eng max'ni iwga tuwiriw

        // 2ci element'dan bowlab array bo'ylab takrorlaw
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // agar kicik element topilsa, min'ni yangilaw
            }
            if (arr[i] > max) {
                max = arr[i]; // agar katta element topilsa, max'ni yangilaw
            }
        }
        return new int[]{min, max}; // min va max qiymatlarini qaytariw
    }

    static void main() {

        // Test 1
        int[] testCase1 = {2, 5, 3, 8, 6};
        int[] result1 = findMinMax(testCase1);
        if (result1 != null) {
            IO.println("Kiriw: " + Arrays.toString(testCase1) + " Ciqiw: (" + result1[0] + ", " + result1[1] + ")");
        }
        // Test 2
        int[] testCase2 = {10, 25, 33, 20, 18};
        int[] result2 = findMinMax(testCase2);
        if (result2 != null) {
            IO.println("Kiriw: " + Arrays.toString(testCase2) + " Ciqiw: (" + result2[0] + ", " + result2[1] + ")");
        }
        // Test 3
        int[] testCase3 = {100, 50, 75, 200, 150};
        int[] result3 = findMinMax(testCase3);
        if (result3 != null) {
            IO.println("Kiriw: " + Arrays.toString(testCase3) + " Ciqiw: (" + result3[0] + ", " + result3[1] + ")");
        }
        // Qo'wimca Test'lar
        int[] emptyArray = {}; // bo'w array
        int[] resultEmpty = findMinMax(emptyArray);
        IO.println("Kiriw: " + Arrays.toString(emptyArray) + " Ciqiw: " + (resultEmpty == null ? "null" : "(" + resultEmpty[0] + ", " + resultEmpty[1] + ")"));

        int[] singleElementArray = {7}; // yagona element'li array
        int[] resultSingle = findMinMax(singleElementArray);
        IO.println("Kiriw: " + Arrays.toString(singleElementArray) + " Ciqiw: " + (resultSingle == null ? "null" : "(" + resultSingle[0] + ", " + resultSingle[1] + ")"));
    }
}