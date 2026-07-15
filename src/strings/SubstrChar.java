package strings;

public class SubstrChar {
    static void main() {
        // Index Bo'yica Character'lar va Substring'larni Ajratib Oliw

        String sentence = "Java dasturlaw ajoyib!";

        IO.println("Uzunlik: " + sentence.length()); // String uzunligi

        // belgini ma'lum bir joyda oliw
        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(sentence.length() - 1);
        IO.println("Birinci char: " + firstChar);
        IO.println("Oxirgi char: " + lastChar);

        // substring'larni ajratib oliw
        String word1 = sentence.substring(0, 4);
        String word2 = sentence.substring(5, 14);
        String fromIndex = sentence.substring(15);

        IO.println("So'z 1: " + word1);
        IO.println("So'z 2: " + word2);
        IO.println("15 ci index'dan: " + fromIndex);
    }
}
