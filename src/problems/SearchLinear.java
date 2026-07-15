package problems;

public class SearchLinear {
    static void main() {

        SearchLinear linearSearch = new SearchLinear();
        int array[] = {-1, 0, 3, 5, 9, 12};
        IO.println(linearSearch.search(array, 9));
    }
    public int search(int[] nums, int target) { // method
        for (int i = 0; i < nums.length; i++) { // for loop block'i array uzunligigaca harakatlaniw
            if (nums[i] == target) {            // agar son i teng bo'lsa target'ga
                return i;                       // u holda i qaytariw
            }
        }
        return -1; // agar hec biriga teng bo'lmasa, -1 qaytariw
    }
}
