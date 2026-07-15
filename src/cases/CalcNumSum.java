package cases;

import java.util.Scanner;

public class CalcNumSum {
    static void main() {
        // for loop - Raqamni Yig'indilarini Hisablaw Dasturi
        Scanner scanner = new Scanner(System.in);

        IO.print("raqam kiritin: ");
        int j = scanner.nextInt();

        int sum = 0; // ko'paytma ucun 0 ni o'rniga 1 qiymat yoziladi
        for (int i = 1; i <= j; i++) {
            IO.println("sum: " + sum + " + " + i);
            sum += i; // ko'paytma ucun + ni o'rniga * yoziladi
        }
        IO.println(sum);
    }
}
