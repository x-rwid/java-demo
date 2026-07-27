package exceptions;

import java.lang.AutoCloseable;

public class ThrowingResource implements AutoCloseable {
    public void close() {
        throw new RuntimeException("Closing exception");
    }
}