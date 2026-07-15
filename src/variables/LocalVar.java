package variables;

public class LocalVar {
    static void main() {
        // Local Variable

        int x = 10; // x bu local variable
        String message = "x teng 10 ga"; // message bu local variable
        IO.println("x = " + x);
        IO.println("xabar = " + message);

        if (x > 5) {
            String result = "x katta 5 dan"; // result bu local variable
            IO.println(result);
        }
        for (int i = 0; i < 3; i++) {
            String loopMessage // loopMessage bu local variable
                    = "Takrorlaw "
                    + i;
            IO.println(loopMessage);
        }

    }
}
