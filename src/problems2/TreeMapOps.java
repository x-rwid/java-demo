package problems2;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapOps {
    static void main() {

        TreeMap<Integer,String> map = new TreeMap<>();

        map.put(10,"daha");
        map.put(20,"mahalla");
        map.put(30,"ko'ca");

        int keyLimit = 20;

        IO.println("Asl Xarita: " + map);
        IO.println("O'lcam kalit cegarasi: " + keyLimit);

        NavigableMap<Integer, String> headMap = map.headMap(keyLimit,false);
        IO.println("Kalitlar ila juftlik < " + keyLimit + ": " + headMap);

        TreeSet<Integer> keySet = new TreeSet<>(map.keySet());
        IO.println("TreeSet sifatida ifodalangan kalitlar: " + keySet);

        map.clear();
        IO.println("Tozalangandan keyingi xarita: " + map);
    }
}
