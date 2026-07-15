package wrappers;

import java.util.ArrayList;

public class UnBoxing {
    static void main() {
        // Unboxing

        Character ch = 'a';
        // qutidan ciqariw: Character -> char
        char c = ch;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(24);
        // qutidan ciqariw: Integer -> int
        int num = list.get(0);
        IO.println(num);
    }
}
