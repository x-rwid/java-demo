package strings;

public class PalindromeStrB {
    static void main() {
        // StringBuilder'da palindrome

        String palindrome = "Dot saw I was Tod";

        StringBuilder sb = new StringBuilder(palindrome);

        sb.reverse(); // teskari qiladi

        IO.println(sb);
    }
}
