package demostreamapis;

import java.util.List;

public class StreamChar {
    static void main() {

        String sentence = "Salam Duke";

        List<String> letters = sentence.chars()
                .mapToObj(Character :: toString)
                .toList();
        IO.println("harflar = " + letters);
    }
}
