package problems;

public class Palindrome {
    static void main() {
        // while loop - teskari masala

        Palindrome palindrome = new Palindrome();
        IO.println(palindrome.isPalindrome(59095));
    }
    public boolean isPalindrome(int x) {
        int temp = x;
        int reverseNumber = 0;
        while (x > 0) {                             // x katta 0 gaca davom etadi
            int n = x % 10;                         // m teng x qoldiqli taqsim 10 ga
            x = x / 10;                             // x teng x taqsim 10 ga
            reverseNumber = reverseNumber * 10 + n; // teskari songa aylantiriw algoritm'i
        }
        return reverseNumber == temp; // kirgan son teskari o'girilsa va u birinci songa teng bo'lsa, true qaytadi
    }
}
