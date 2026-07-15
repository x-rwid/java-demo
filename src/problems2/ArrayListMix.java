package problems2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMix {

    public static <T> void swapElement(ArrayList<T> list, int index1, int index2) {
        if (index1 >= 0 && index1 < list.size() && index2 >= 0 && index2 < list.size()) {
            Collections.swap(list, index1, index2);
        } else {
            IO.println("Almawtiriw ucun no to'g'ri index'lar");
        }
    }

    public static <T> ArrayList<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2) {
        ArrayList<T> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    static void main() {

        ArrayList<String> firstList = new ArrayList<>();

        firstList.add("Gamma");
        firstList.add("Beta");
        firstList.add("Alfa");
        IO.println("Dastlabki ruyxat (Sig'im 3): " + firstList);

        swapElement(firstList, 0, 2);
        IO.println("0 va 2 index'lar alamawgandan keyin: " + firstList);

        firstList.ensureCapacity(6);
        firstList.add("Delta");
        firstList.add("Epsilon");
        firstList.add("Zeta");
        IO.println("Kegaytirilgan ilk ruyxat (Sig'im 6): " +  firstList);

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Eta");
        secondList.add("Teta");

        ArrayList<String> combinedList = mergeLists(firstList, secondList);
        IO.println("Yakuniy birlawgan ruyxat" + combinedList);
    }
}
