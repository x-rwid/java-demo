package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo {
    static void main() {

        // List'dan Set'ga o'tiw
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        HashSet<String> hashSet = new HashSet<>(list);
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("null");

        IO.println(hashSet);

        // lambda expression orqali cop etiw
//        hashSet.forEach(s -> {
//            IO.println(s);
//        });
    }
}