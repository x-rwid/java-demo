package collections;

import java.util.HashMap;
import java.util.Map;

public class MapUpdate {
    static void main() {

        var ages = Map.of("Alisa", 25, "BiBi", 30, "Caros", 28, "David", 35);
        ages = new HashMap<>(ages);
        IO.println("Yowlar: " + ages);

        var previousValue = ages.put("Alisa", 26); // mavjud kalitni yangilaw
        IO.println("Alisani oldingi yowi: " + previousValue);

        previousValue = ages.putIfAbsent("Alisa", 27); // faqat kalit mavjud bo'lmasa qo'wiladi
        IO.println("Alisani oldingi yowi: " + previousValue);

        previousValue = ages.putIfAbsent("Eva", 22); // faqat kalit mavjud bo'lmasa qo'wiladi
        IO.println("Evani oldingi yowi: " + previousValue);
        IO.println("Yangilangan map: " + ages);

        ages.remove("David");
        IO.println("Davidni olib tawlanganidan keyin: " + ages);

        var keySet = ages.keySet();
        IO.println("Kalit set'i: " + keySet);

        var values = ages.values();
        IO.println("Qiymat collection'i: " + values);

        var entries = ages.entrySet();
        IO.println("Kiriw set'i: " + entries);
    }
}
