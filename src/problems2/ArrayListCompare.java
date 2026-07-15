package problems2;

import java.util.ArrayList;

public class ArrayListCompare {

    public static ArrayList<String> compareList(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> result = new ArrayList<>();

        int minSize = Math.min(list1.size(), list2.size());

        for (int i = 0; i < minSize; i++) {
            if (list1.get(i).equals(list2.get(i))) {
                result.add("Ha");
            } else {
                result.add("Yo'q");
            }
        }
        return result;
    }

    static void main() {

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Yawil");
        l1.add("Qizil");

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Yawil");
        l2.add("Qora");

        IO.println(compareList(l1, l2));
    }
}
