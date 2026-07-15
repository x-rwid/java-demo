package problems;

public class ArrSortBubble {
    // Bubble Sort Algoritm'i Bo'yica Arrayni O'siw Tartibida Saralaw

    public static int[] sortArray(int[] arr) {

        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for  (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    static void main() {
        int[] inputArray = { 5, 2, 8, 1, 9};
        int[] sortedArray = sortArray(inputArray);

        IO.print("Tartiblangan array: [");
        for (int i = 0; i < sortedArray.length; i++) {
            IO.print(sortedArray[i] + (i < sortedArray.length - 1 ? ", " : ""));
        }
        IO.println("]");
    }
}
