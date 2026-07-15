package problems;
import java.util.Arrays;

public class ArrSumElements {
    // Array'dagi hamma element'larni yig'indisini hisablaw

    public static int sumArrayElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void main() {

        // Test 1
        int[] arr1 = {2, 5, 3, 8, 6};
        IO.println("Kiriw: " + Arrays.toString(arr1) + " Ciqiw: " + sumArrayElements(arr1));

        // Test 2
        int[] arr2 = {10, 25, 33, 20, 18};
        IO.println("Kiriw: " + Arrays.toString(arr2) + " Ciqiw: " + sumArrayElements(arr2));

        // Test 3
        int[] arr3 = {100, 50, 75, 200, 150};
        IO.println("Kiriw: " + Arrays.toString(arr3) + " Ciqiw: " + sumArrayElements(arr3));
    }
}
