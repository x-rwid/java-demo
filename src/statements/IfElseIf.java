package statements;

import java.util.Scanner;

public class IfElseIf {
    static void main() {
        // if-else if

        Scanner scanner = new Scanner(System.in);
//        int day = scanner.nextInt();
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();

        // 5 ta kun dasturi
//        if (day == 1) {
//            IO.println("Ilgari");
//        } else if (day == 2) {
//            IO.println("Keca");
//        } else if (day == 3) {
//            IO.println("Bugun");
//        } else if (day == 4) {
//            IO.println("Erta");
//        } else if (day == 5) {
//            IO.println("Indin");
//        } else {
//            IO.println("Bunday kun yo'q.");
//        }

        // mantiqiy wart tekwiriw
        if (a1 > b1 && a1 > c1) {
            IO.println("a1 = " + a1);
        } else if (b1 > a1 && b1 > c1) {
            IO.println("b1 = " + b1);
        } else if (c1 > a1 && c1 > b1) {
        }
    }
}
