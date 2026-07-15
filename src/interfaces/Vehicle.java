package interfaces;

public interface Vehicle {

    // icki foydalaniw ucun private method
    private void startEngine() {
        IO.println("Engine iwga tuwdi.");
    }

    // private method'dan foydalanadigan default method
    default void drive() {
        // private method'ni caqiriw
        startEngine();
        IO.println("Markab harakatda.");
    }
}
