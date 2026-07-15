package statements;

import java.util.Scanner;

public class LoopWhileDo {
    static void main() {
        // nested loop: while vs do-while - 0 raqam kiritilsa farqi bilinadi

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int j = 0;
        do {
            j++;
            IO.println(j);
        } while (j < n);
        IO.println("_____________________");
        int k = 0;
        while (k < n) {
            k++;
            IO.println(k);
        }
    }
}
