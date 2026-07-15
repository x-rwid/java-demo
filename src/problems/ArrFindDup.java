package problems;
import java.util.*;

public class ArrFindDup {
    // Array'dagi hamma element'larni 2ci nusxalarini oliw

    public static List<Integer> findDuplicates(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        // har bir element'ni takrorini hisablaw
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        // takror ila element'lar qo'wiw >= 2 duplicate'lar list'iga
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() >= 2) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }

    static void main() {

        // Test 1
        int[] arr1 = {2, 5, 3, 5, 8, 6};
        List<Integer> result1 = findDuplicates(arr1);
        IO.println("Kiriw: " + Arrays.toString(arr1) + " Ciqiw: " + result1);

        // Test 2
        int[] arr2 = {10, 25, 33, 20, 18, 25};
        List<Integer> result2 = findDuplicates(arr2);
        IO.println("Kiriw: " + Arrays.toString(arr2) + " Ciqiw: " + result2);

        // Test 3
        int[] arr3 = {100, 50, 75, 200, 150, 50, 100};
        List<Integer> result3 = findDuplicates(arr3);
        IO.println("Kiriw: " + Arrays.toString(arr3) + " Ciqiw: " + result3);
    }

}
