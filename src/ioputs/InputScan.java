package ioputs;

import java.util.Scanner;

public class InputScan {
    static void main() {

        /*
        Scanner class'idan scanner nomli object tuziladi va
        data type'lar qiymatlar oladi va Scanner esa o'z method'larini oladi va
        klaviatura'dan kiritiladigan xabarlarni ma'lumatlar turiga o'zlawtirib beradi.
        next() method'i ajratilgan so'zlarni to'liq o'qimaydi, u faqat butun so'zni o'qiydi,
        wunin ucun nextLine() method'i qo'llanildi,
        close() method'i Scanner object'ini yopadi.
         */

        Scanner scan = new Scanner(System.in);

        IO.print("Int'ni kiritin: ");
        int myInt = scan.nextInt();
        IO.println("Kiritilgan int: " + myInt);

        IO.print("Long'ni kiritin: ");
        long myLong = scan.nextLong(); // foydalanuvcidan input oliw
        IO.println("Kiritilgan long: " + myLong);

        IO.print("Float'ni kiritin: ");
        float myFloat = scan.nextFloat(); // foydalanuvcidan input oliw
        IO.println("Kiritilgan float: " + myFloat);

        IO.print("Double'ni kiritin: ");
        double myDouble = scan.nextDouble(); // foydalanuvcidan input oliw
        IO.println("Kiritilgan double: " + myDouble);

        // quyidagi dastur ucun yana Scanner bo'liwi wart
        Scanner input = new Scanner(System.in);

        IO.print("Ism va warifizni kiritin: ");
        String myString = input.nextLine(); // foydalanuvcidan input oliw
        IO.println("Foydalanuvci ismi: " + myString);

        input.close(); // Scanner object'ini yopiw
    }
}
