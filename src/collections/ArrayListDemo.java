package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    static void main() {

        ArrayList<String> list = new ArrayList<>();
        list.add("tarvuz");
        list.add("qovun");
        list.add("handalak");

        // 1-usul
//        for (int i = 0; i < list.size(); i++) {
//            IO.println(list.get(i));

        // 2-usul
//        for (String s : list) {
//            IO.println(s);

        // 3-usul
//                list.forEach(s -> {
//                IO.println(s);
//        });

        list.remove("handalak"); // element'ni o'ciriw method'i
        Collections.sort(list); // ruyxatni saralaw method'i

        list.forEach(System.out::println);
    }
}
