package problems;

public class ArrSortLinear {
    /*
    Linear Search algoritm'i bo'yica
    Array'dagi element'larni o'sib boruvci tarzda tartiblanganligini tekwiriw.
    Agar array o'sib boruvci tartibda tartiblangan bo'lsa, true qaytaradi, aks holda false.
     */
    public static boolean sortedAscending(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true; // bo'w yo bitta element'li array tartiblangan hisablanadi
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // keyingi element'dan kattaro element topildi, wunin ucun tartiblanmagan
            }
        }
        return true; // hamma element'lar o'siw tartibida
    }

    static void main() {

        // Test 1
        int[] arr1 = {2, 5, 6, 8, 9};
        IO.println("Kiriw: " + java.util.Arrays.toString(arr1) + " Ciqiw: " + sortedAscending(arr1));

        // Test 2
        int[] arr2 = {10, 8, 5, 3, 2};
        IO.println("Kiriw: " + java.util.Arrays.toString(arr2) + " Ciqiw: " + sortedAscending(arr2));

        // Test 3
        int[] arr3 = {100, 150, 175, 200, 250};
        IO.println("Kiriw: " + java.util.Arrays.toString(arr3) + " Ciqiw: " + sortedAscending(arr3));

        // Qo'wimca Test'lar
        int[] arr4 = {}; // bo'w array
        IO.println("Kiriw: " + java.util.Arrays.toString(arr4) + " Ciqiw: " + sortedAscending(arr4));

        int[] arr5 = {7}; // yagona element'li array
        IO.println("Kiriw: " + java.util.Arrays.toString(arr5) + " Ciqiw: " + sortedAscending(arr5));

        int[] arr6 = {1, 1, 2, 3}; // 2ci nusxaga ega array
        IO.println("Kiriw: " + java.util.Arrays.toString(arr6) + " Ciqiw: " + sortedAscending(arr6));

        int[] arr7 = {5, 1, 3}; // tartiblanmagan array
        IO.println("Kiriw: " + java.util.Arrays.toString(arr7) + " Ciqiw: " + sortedAscending(arr7));
    }
}
