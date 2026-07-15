package problems2;

import java.util.LinkedList;

public class LinkedListMerge {

    public static <T>LinkedList<T> mergeLists(LinkedList<T> list1, LinkedList<T> list2) {
        LinkedList<T> mergedList = new LinkedList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    public static <T> LinkedList<T> copyList(LinkedList<T> orginalList) {
        return new LinkedList<>(orginalList);
    }

    public static <T> void removeFirstAndPrint(LinkedList<T> list) {
        if (list == null || list.isEmpty()) {
            IO.println("Ruyxat bo'w.");
            return;
        }

        list.pollFirst();
        IO.println("Qolgan element'lar: " + list);
    }

    static void main() {

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("C++");
        list1.add("Java");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("JavaScript");
        list2.add("Kotlin");

        IO.println("Asl Ruyxat 1: " + list1);
        IO.println("Asl Ruyxat 2: " + list2);
        IO.println();

        LinkedList<String> mergedResult = mergeLists(list1, list2);
        IO.println("a) Birlawtirilgan Natija: " + mergedResult);

        LinkedList<String> copiedResult = copyList(list1);
        IO.println("b) Nusxalangan Natija: " + copiedResult);

        IO.println("c) Birlawtirilgan natijadan birincisini olib tawlaw ->");
        removeFirstAndPrint(mergedResult);
    }
}
