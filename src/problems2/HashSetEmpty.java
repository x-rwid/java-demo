package problems2;

import java.util.HashSet;

public class HashSetEmpty {
    static void main() {

        HashSet<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Merc");

        IO.println("To'plamni o'lcami: " + cars.size());

        if (cars.isEmpty()) {
            IO.println("To'plam bo'w.");
        } else  {
            IO.println("To'plamni bo'w emas.");
        }

        cars.clear();
        IO.println("Tozalawdan keyingi o'lcam: " + cars.size());
        IO.println("To'plam hozir bo'wmi? " + cars.isEmpty());
    }
}
