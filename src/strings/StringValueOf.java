package strings;

public class StringValueOf {
    static void main(String[] args) {
        // String'larni raqamlarga aylantiriw

        // dastur buyruq satrida 2 ta argument'ni talab etadi
        if(args.length == 2) {
            // string'larni raqamlarga aylantiriw
            float a = (Float.valueOf(args[0])).floatValue();
            float b = (Float.valueOf(args[1])).floatValue();

            // hisab amallar
            IO.println("a + b = " + (a + b));
            IO.println("a - b = " + (a - b));
            IO.println("a * b = " + (a * b));
            IO.println("a /  b = " + (a / b));
            IO.println("a % b = " + (a % b));
        } else {
            IO.println("Dastur " + "2 ta buyruq satri argument'ini talab etadi.");
        }
    }
}
