package objects;

public class SubClass extends SuperClass {

        // Superclass'da printMethod method'ini override'laydi
    public void printMethod() {
        super.printMethod();
        IO.println("Subclass'da cop etilgan.");
    }
    static void main() {
        SubClass s = new SubClass();
        s.printMethod();
    }
}
