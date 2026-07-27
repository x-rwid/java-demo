package exceptions;

public class TryCatchDemo {
    static void main() {

        try {
            int[] numbers = {1, 2, 3};
            IO.println("Yaqroqli index'ga kiriw: " + numbers[1]);
            IO.println("Yaqroqsiz index'ga kiriw: " + numbers[5]); // bu istisna otadi
            IO.println("Siz bu xabarni ko'rmasligiz kerak");
        } catch (ArrayIndexOutOfBoundsException e) {
            IO.println("Istisna tutildi: " + e.getMessage());
        }
        IO.println("Dastur istisnadan keyin davom etadi...");
    }
}
