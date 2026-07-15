package problems2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSearch {
    static void main() {

        ArrayList<String> names = new ArrayList<>();
        names.add("Hasan");
        names.add("Husayn");
        names.add("Muhsin");

        String target = "Husayn";
        if  (names.contains(target)) {
            IO.println(target + " ruyxatda topildi!");
        } else {
            IO.println(target + " ruyxatda topilmadi!");
        }

        ArrayList<String> namesCopy = new ArrayList<>(names);
        Collections.shuffle(namesCopy);

        IO.println("Asl Ruyxat: " + names);
        IO.println("Aralaw Nusxa: " + namesCopy);
    }
}
