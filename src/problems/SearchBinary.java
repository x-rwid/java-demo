package problems;

public class SearchBinary {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length -1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // butun sonni towib ketiwini oldini oliw ucun

            if (nums[mid] == target) {
                return mid;                   // target index mid'da topildi
            } else if (nums[mid] < target) {
                low = mid + 1;                // o'ngni yarmini qidiriw
            } else {
                high = mid - 1;               // capni yarmini qidiriw
            }
        }
        return -1; // target topilmadi
    }
    static void main() {
        SearchBinary searchBinary = new SearchBinary();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int result = searchBinary.search(nums, target);
        IO.println("Index " + target + ": " + result);

        target = 2;
        result = searchBinary.search(nums, target);
        IO.println("Index " + target + ": " + result);
    }
}
