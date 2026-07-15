package problems2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListMix {
    static void main() {

        LinkedList<String> comics = new LinkedList<>();
        comics.add("Iron Man");
        comics.add("Captain America");
        comics.add("Natalie Romanoff");
        comics.add("Wolverine");

        IO.println("Asl LinkedList: " + comics);

        Collections.shuffle(comics);
        IO.println("Aralawgan LinkedList: " + comics);

        ArrayList<String> comicsHeroes = new ArrayList<>(comics);
        IO.println("Nusxalangan ArrayList: " + comicsHeroes);

        Collections.sort(comics);
        IO.println("Saralangan LinkedList: " + comics);

        String searchTarget = "Iron Man";
        boolean exits = comics.contains(searchTarget);
        IO.println(searchTarget + " mavjudmi? " + exits);
    }
}
