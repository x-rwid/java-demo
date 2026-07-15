package problems;

public class ArrMerger {
    // 2ta Arrayni Birlawtiriw

    public static int[] mergeArrays(int[] array1, int[] array2) {

        int[] mergedArray = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        return mergedArray;
    }

    static void main() {
        int[] array1 = {0, 1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8, 9};

        int[] result = mergeArrays(array1, array2);
        IO.println(java.util.Arrays.toString(result));
    }
}
