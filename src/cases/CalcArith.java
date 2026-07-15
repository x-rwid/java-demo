package cases;

import java.util.Scanner;

public class CalcArith {
    static void main() {
        // Hisablaw Dasturi

        Scanner scan = new Scanner(System.in);

        IO.print("1ci sonni kiritin: ");
        int number1 =  scan.nextInt();
        IO.print("2ci sonni kiritin: ");
        int number2 = scan.nextInt();

        int sum = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;

        String divisionResult;
        if (number2 != 0) {
            divisionResult = String.valueOf((double) number1 / number2);
        } else  {
            divisionResult = "Taqsimlaw mumkin emas.";
        }

        IO.println("Yig'indi: " + sum + ", Ayirma: " + subtraction +
                ", Ko'paytma: " + multiplication + " Taqsim: " + divisionResult);

        scan.close();
    }
}
