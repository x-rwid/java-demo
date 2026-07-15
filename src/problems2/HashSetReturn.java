package problems2;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetReturn {
    static void main() {

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        ArrayList<Integer> result = getUniqueElement(set1, set2);

        IO.println("Noyob element'lar: " + result);
    }
    public static <T> ArrayList<T> getUniqueElement(HashSet<T> set1, HashSet<T> set2) {
        HashSet<T> diff1 = new HashSet<>(set1);
        HashSet<T> diff2 = new HashSet<>(set2);

        diff1.removeAll(set2);
        diff2.removeAll(set1);

        ArrayList<T> result = new ArrayList<>(diff1);
        result.addAll(diff2);
        return result;
    }
}
