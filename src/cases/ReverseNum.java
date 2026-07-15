package cases;

import java.util.Scanner;

public class ReverseNum {
    static void main() {
        // while loop - Raqamlarni Teskariga Ugiriw Dasturi

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer stringBuffer = new StringBuffer("" + n);
        IO.println(stringBuffer.reverse());

        int i = 0;
        int number = 0;
        while (0 < n) {
            int j = n % 10;
            n = n / 10;
            number = number * 10 + j;
        }
        IO.println(number);
    }
}
