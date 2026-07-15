package problems;
import java.util.Arrays;

public class ArrSecondL {
    // Array'dagi 2ci eng katta element'larni izlaw

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }
        Arrays.sort(arr);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    static void main() {

        // Test 1
        int[] arr1 = {2, 5, 3, 8, 6};
        IO.println("Kiriw: " + Arrays.toString(arr1) + " Ciqiw: " + findSecondLargest(arr1));

        // Test 2
        int[] arr2 = {10, 25, 33, 20, 18};
        IO.println("Kiriw: " + Arrays.toString(arr2) + " Ciqiw: " + findSecondLargest(arr2));

        // Test 3
        int[] arr3 = {100, 50, 75, 200, 150};
        IO.println("Kiriw: " + Arrays.toString(arr3) + " Ciqiw: " + findSecondLargest(arr3));
    }
}
