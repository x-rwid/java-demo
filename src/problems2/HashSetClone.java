package problems2;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetClone {
    static void main() {

        HashSet<String> originalSet =  new HashSet<>();
        originalSet.add("a");
        originalSet.add("b");
        originalSet.add("c");
        originalSet.add("d");
        originalSet.add("e");

        @SuppressWarnings("tekwirilmagan")
        HashSet<String> clonedSet = (HashSet<String>) originalSet.clone();

        ArrayList<String> list = new ArrayList<>(clonedSet);

        for (int i = 0; i < list.size(); i += 2) {
            IO.println("Index " + i + ": " + list.get(i));
        }
    }
}
