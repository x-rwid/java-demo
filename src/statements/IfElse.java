package statements;

import java.util.Scanner;

public class IfElse {
    static void main() {
        // if-else: 100 dan kicik va katta raqamni aniqlaydigan dastur

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 100) {
            IO.println(num + " bu raqam 100 dan kicik");
        } else {
            IO.println(num + " bu raqam 100 dan katta");
        }
    }
}