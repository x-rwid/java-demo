package exceptions;

import java.util.Arrays;

public class AutoCloseable {
    static void throwException() {
        try (var resource = new ThrowingResource()) {
            throw new RuntimeException("Try exception");
        }
    }

    static void main() {

        try {
            throwException();
        } catch (RuntimeException e) {
            IO.println("Caught exception: " + e);
            IO.println("Root exception: " + e.getCause());
            IO.println("Number of suppressed exceptions: " + e.getSuppressed().length);
            IO.println("Suppressed exception(s): " + Arrays.toString(e.getSuppressed()));
        }
    }
}
