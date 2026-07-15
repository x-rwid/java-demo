package statements;

import java.util.Scanner;

public class LoopNested {
    static void main() {
        // Iteration Statement'lar

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        // while loop: kiritilgan raqamni qiymatini n gaca owiriw dasturi
//        int i = 0;
//        while (i < n) {
//            IO.println(i);
//            i++;
//        }

//        // do-while loop: kiritilgan raqamni qiymatini n gaca owiriw dasturi
//        int i = 0;
//        do {
//            i++;
//            IO.println(i);
//        } while (i < n);

//        // nested: if dagi mantiqiy wartlarni for da tekwiriw
//        for (int i = 0; i < 10; i++) {
//            if (i != 3 || i != 6) {
//                IO.println(i);
//            }
//        }

        // nested: 1 dan n gaca 5 va 3 ga taqsimlanadigan raqamlarni yig'indisini topiw
        int summa = 0;
        for (int i = 1; i < n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                IO.println(i);
                summa += i;
            }
        }
        IO.println(summa);
    }
}

