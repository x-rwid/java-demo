package problems2;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetElem {

    public static <T> ArrayList<T> getDifferenceFirstNotSecond(HashSet<T> set1, HashSet<T> set2) {
        ArrayList<T> result = new ArrayList<>();
        for (T element : set1) {
            if (!set2.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static <T> ArrayList<T> getDifferenceSecondNotFirst(HashSet<T> set1, HashSet<T> set2) {
        ArrayList<T> result = new ArrayList<>();
        for (T element : set2) {
            if (!set1.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static ArrayList<Integer> getEvenElements(HashSet<Integer> set1, HashSet<Integer> set2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer element : set1) {
            if (element % 2 == 0) {
                result.add(element);
            }
        }

        for (Integer element : set2) {
            if (element % 2 == 0 && !set1.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    static void main() {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        IO.println("1 ci, 2 ci emas: " + getDifferenceFirstNotSecond(set1, set2));
        IO.println("2 ci, 1 ci emas: " + getDifferenceSecondNotFirst(set1, set2));
        IO.println("juft element'lar: " + getEvenElements(set1, set2));
    }
}
