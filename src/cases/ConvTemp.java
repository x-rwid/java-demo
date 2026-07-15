package cases;

import java.util.Scanner;

public class ConvTemp {
    static void main() {
        // Fahrenheit Bo'yica Harorotni Celsius'ga Aylantiriw Dasturi

        Scanner scan =  new Scanner(System.in);

        IO.print("Fahrenheit bo'yica harorotni kiritin: ");
        double fahrenheit = scan.nextDouble();

        double celcius = (fahrenheit - 32) * 5 / 9;

        IO.println("Celcius bo'yica harorot: " + celcius);

        scan.close();

        // Quyidagilar Scanner'siz
//        // Test 1
//        double fahrenheit1 = 32.0;
//        double celsius1 = (fahrenheit1 - 32.0) * (5.0 / 9.0);
//        IO.println("Fahrenheit: " + fahrenheit1 + ", Celsius: " + celsius1);
//
//        // Test 2
//        double fahrenheit2 = 68.0;
//        double celsius2 = (fahrenheit2 - 32.0) * (5.0 / 9.0);
//        IO.println("Fahrenheit: " + fahrenheit2 + ", Celsius: " + celsius2);
//
//        // Test 3
//        double fahrenheit3 = 104.0;
//        double celsius3 = (fahrenheit3 - 32.0) * (5.0 / 9.0);
//        IO.println("Fahrenheit: " + fahrenheit3 + ", Celsius: " + celsius3);
    }
}
