package classes;

public abstract class BankClass {
    // Abstract Class - superclass

    abstract void rate();

    void getMessage() {
        IO.println("Bank'larda Dollar Kurs'i:");
    }
}
