package statements;

import java.util.Scanner;

public class Switch {
    static void main() {
        // switch - oyni soni bo'yica faslni aniqlovci dastur

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 3, 4, 5:
                IO.println("Bahar");
                break;
            case 6, 7, 8:
                IO.println("Yoz");
                break;
            case 9, 10, 11:
                IO.println("Kuz");
                break;
            case 12, 1, 2:
                IO.println("Qiw");
                break;
            default: {
                IO.println("Bunday oy yo'q");
            }
        }
    }
}
