package collections;

import java.util.HashMap;
import java.util.Map;

public class MapLambda3 {
    static void main() {

        Map<String, Integer> inventory = Map.of(
                "xurma", 50,
                "zaytun", 30,
                "anjir", 25);

        // inventory'ni o'zgartiriw mumkin
        inventory = new HashMap<>(inventory);

        IO.println("Dastlabki xatlov");
        inventory.forEach((item, count) -> IO.println(" " + item + ": " + count));

        // compute - doim ijroda, null qiymatlarga iwolov beriw mukin
        inventory.compute("xurma", (item, count) -> count != null ? count + 20 : 20);

        // computeIfPersent - faqat kalit mavjud bo'lsa va qiymat null bo'lmasa
        inventory.computeIfPresent("zaytun", (item, count) -> count - 5);

        // computeIfAbsent - faqat kalit mavjud bo'lmasa yo qiymat null bo'lsa
        inventory.computeIfAbsent("anor", item -> 15);

        IO.println("");
        IO.println("Hisablaw amaliyatlaridan keyin:");
        inventory.forEach((item, count) -> IO.println(" " + item + ": " + count));

        // ko'pro namunalar
        inventory.computeIfPresent("no mavjud", (item, count) -> 999); // ijro etilmaydi
        inventory.computeIfAbsent("urik", item -> 12); // ijro etiladi

        IO.println("");
        IO.println("Yakuniy xatlov:");
        inventory.forEach((item, count) -> IO.println(" " + item + ": " + count));
    }
}
