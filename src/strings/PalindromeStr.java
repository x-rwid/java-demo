package strings;

public class PalindromeStr {
    static void main() {
        // String length

        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        // asl string'ni char'lar array'iga aylantiriw
        palindrome.getChars(0, len, tempCharArray, 0);
//        for (int i = 0; i < len; i++) {
//            tempCharArray[i] = palindrome.charAt(i);
//        }

        // char'larni teskari array'i
        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];
        }

        String reversePalimdrome = new String(charArray);
        IO.println(reversePalimdrome);
    }
}
