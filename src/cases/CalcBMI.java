package cases;

import java.util.Scanner;

public class CalcBMI {
    static void main() {
        // Tana Yalpi Hisablagic

        Scanner input = new Scanner(System.in);

        IO.print("Vaznni kilo'da kiritin: ");
        double weight = input.nextDouble();
        IO.print("Bo'yni metr'da kiritin: ");
        double height = input.nextDouble();

        if (height > 0) {
            double bmi = weight / (height * height);
            IO.println("Tanani Yalpi Miqdari: " + bmi);
        } else {
            IO.println("Error: Bo'y 0 dan yuqori bo'liwi kerak.");
        }
        input.close();
    }
}
