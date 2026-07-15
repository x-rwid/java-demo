package cases;

import java.util.Scanner;

public class ConvGrade {
    static void main() {
        // Bahoni Matnga Ugiruvci Dastur

        Scanner scanner = new Scanner(System.in);
        IO.print("Raqam kiritin: ");

        if (scanner.hasNextInt()) {
            int grade = scanner.nextInt();
            String result;

            switch (grade) {
                case 1:
                    result = "Yomon";
                    break;
                case 2:
                    result = "Qoniqarsiz";
                    break;
                case 3:
                    result = "Qoniqarli";
                    break;
                case 4:
                    result = "Yaxwi";
                    break;
                case 5:
                    result = "A'lo";
                    break;
                default:
                case 6:
                    result = "Xato baho";
                    break;
            }
            IO.println("Natija: " + result);
        } else {
            IO.println("Natija: Xato baho");
        }
        scanner.close();
    }
}
