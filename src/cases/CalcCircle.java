package cases;
import java.util.Scanner;

public class CalcCircle {
    static void main() {
        // Doira Maydoni Hisablagic

        Scanner scanner = new Scanner(System.in);
        IO.print("Radius'ni kiritin: ");

        if (scanner.hasNextDouble()) {
            double radius = scanner.nextDouble();

            if (radius < 0) {
                IO.println("Error: Radius manfiy bo'liwi mumkin emas.");
            } else if (radius == 0) { // agar radius 0 ga teng bo'lsa,
                IO.println("Maydon: 0.0"); // maydon ham 0 ga teng
            } else {
                double area = Math.PI * Math.pow(radius, 2); // maydon = π * r^2
                IO.println("Maydon: " + area);
            }
        } else {
            IO.println("Error: Kiritilgan ma'lumat xato. Iltimos, haqiqiy son kiritin.");
        }
        scanner.close();
    }
}
