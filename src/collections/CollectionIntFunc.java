package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionIntFunc {
    static void main() {

        /*
        toArray method'ni 3 ci naqwi
        IntFunction<T> method reference yordamida to'g'ri 0 uzunlikdagi array tuziladi
        va bu method keyin toArray() method'ni caqiradi
        va bu array argument sifatida uzatiladi.
         */

        Collection<String> strings = new ArrayList<>(); // collection'da 4 element bor
        strings.add("yak");
        strings.add("du");
        strings.add("se");
        strings.add("cor");

        String[] tabString3 = strings.toArray(String[]::new);
        IO.println("Tab string 3: " +  Arrays.toString(tabString3));
    }
}
