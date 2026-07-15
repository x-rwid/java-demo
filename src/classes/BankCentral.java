package classes;

public class BankCentral {
    static void main() {

        BankOrient orientBank = new BankOrient();
        BankMilliy milliyBank = new BankMilliy();

        orientBank.getMessage();
        orientBank.rate();
        milliyBank.rate();
    }
}
