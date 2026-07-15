package cases;

import java.util.Scanner;

public class TestBool {
    static void main() {
        // Mantiqiy Sinov Dasturi

        Scanner scanner = new Scanner(System.in);

        IO.print("1ci mantiqiy qiymatni kiritin: ");
        boolean b1 = scanner.nextBoolean();
        IO.print("2ci mantiqiy qiymatni kiritin: ");
        boolean b2 = scanner.nextBoolean();

        boolean andResult = b1 && b2;
        boolean orResult = b1 || b2;

        IO.println("VA: " + andResult + ", YO: " + orResult);

        scanner.close();

        // Quyidagilar Scanner'siz
//        // Test 1
//        boolean a = true;
//        boolean b = false;
//        IO.println("Test 1:\na va b = " + (a && b) + "\na yo b = " + (a || b));
//
//        // Test 2
//        boolean x = false;
//        boolean y = true;
//        IO.println("\nTest 2:\nx va y = " + (x && y) + "\nx yo y = " + (x || y));
//
//        // Test 3
//        boolean u = true;
//        boolean v = true;
//        IO.println("\nTest 3:\nu va v = " + (u && v) + "\nu yo v = " + (u || v));
//
//        // Test 4
//        boolean w = false;
//        boolean z = false;
//        IO.println("\nTest 4:\nw va z = " + (w && z) + "\nw yo z = " + (w || z));
    }
}
