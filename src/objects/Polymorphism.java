package objects;

public class Polymorphism {
    // Polymorphism - compile-time

    int add (int a, int b) {
        return a + b;
    }

    int add (int a, int b, int c) {
        return a + b + c;
    }

    static void main() {
        Polymorphism polyCalc = new Polymorphism();

        IO.println(polyCalc.add(10, 20));
        IO.println(polyCalc.add(10, 20, 3));
    }
}
