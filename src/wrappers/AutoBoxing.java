package wrappers;

import java.util.ArrayList;

public class AutoBoxing {
    static void main() {
        // Autoboxing

        char ch = 'a';
        // qutiga soliw: char -> Character
        Character c = ch;

        ArrayList<Integer> list = new ArrayList<>();
        // qutiga soliw: int -> Integer
        list.add(25);
        IO.println(list.get(0));
    }
}
