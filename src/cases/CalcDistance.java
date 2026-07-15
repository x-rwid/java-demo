package cases;
import java.util.Scanner;

public class CalcDistance {
    static void main() {
        // Masofa Hisablagic

        Scanner scan = new Scanner(System.in);

        IO.print("x1 ni kiritin: ");
        double x1 = scan.nextDouble();
        IO.print("y1 ni kiritin: ");
        double y1 = scan.nextDouble();

        IO.print("x2 ni kiritin: ");
        double x2 = scan.nextDouble();
        IO.print("y2 ni kiritin: ");
        double y2 = scan.nextDouble();

        double deltaX = x2 - x1;
        double deltaY = y2 - y1;

        // Pifagor teorema'si: masofa = sqrt(deltaX^2 + deltaY^2)
        double distance = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));

        IO.println("Masofa: " + distance);

        scan.close();
    }
}
