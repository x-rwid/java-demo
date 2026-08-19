package collections;

import java.util.HashMap;
import java.util.Map;

public class MapPut {
    static void main() {

        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alisa", 25);
        ages.put("BiBi", 30);
        ages.put("Caros", 28);
        ages.put("David", 35);
        IO.println("Map hajmi: " + ages.size());
        IO.println("Yowlar: " + ages);

        var ages1 = Map.of("Alisa", 25, "BiBi",30, "Caros", 28, "David", 35);
        IO.println("Yowlar: " + ages1);

        IO.println("Alisani yowi: " + ages1.get("Alisa"));
        IO.println("Evani yowi: " + ages1.get("Eva")); // null qaytaradi
        IO.println("Evani yowi (sukut bo'yica): " + ages1.getOrDefault("Eva", 0));

        IO.println("BiBi kalit sifatida mavjudmi? " +  ages1.containsKey("BiBi"));
        IO.println("BiBi qiymat sifatida mavjudmi? " +  ages1.containsValue("BiBi"));
        IO.println("Qiymat sifatida 28 yowni oladimi? " +  ages1.containsValue(28));
        IO.println("Kalit sifatida 28 yowni oladimi? " +  ages1.containsKey(28));
    }
}
