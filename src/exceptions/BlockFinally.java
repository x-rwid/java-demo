package exceptions;

import java.util.Arrays;

public class BlockFinally {

    static void throwingFromFinally() {
        try {
            IO.println("Running try");
            throw new RuntimeException("Exception from try");
        } finally {
            IO.println("Running finally");
            throw new RuntimeException("Exception from finally");
        }
    }

    static void main() {
        try {
            throwingFromFinally();
        } catch (RuntimeException e) {
            IO.println("Caught exception: " + e);
            IO.println("Root exception: " + e.getCause());
            IO.println("Suppressed exception: " + Arrays.toString(e.getSuppressed()));
        }
    }
}
