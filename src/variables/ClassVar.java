package variables;

public class ClassVar {
    // Class Variable (Static Field)

    static String brand = "Java";

    public static void main (String[]args) {

        // Object tuzmasdan static variable'ga kiriw
        IO.println("Brand nom: " + ClassVar.brand);
    }
}
