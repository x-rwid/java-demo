package problems2;

import java.util.*;

public class HashSetReverse {
    static void main() {

        HashSet<String> cities = new HashSet<>();
        cities.add("Havakand");
        cities.add("Samarqand");
        cities.add("Xorazm");
        cities.add("Andijan");

        IO.println("Iterator yordamida element'larni ko'rsatiw:");
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            IO.println(iterator.next());
        }
        IO.println();

        List<String> citiesList = new ArrayList<>(cities);

        Collections.reverse(citiesList);

        IO.println("Element'larni teskari tartibda ko'rsatiw:");
        for (String city : citiesList) {
            IO.println(city);
        }
    }
}
