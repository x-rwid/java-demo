package strings;

public class StrLitConst {
    static void main() {

        // String literal
        String greeting = "Salam, Dunya!";
        System.out.println("Salamlawuv: " + greeting);

        // Constructor 1: new keyword yordamida String tuziw
        String str1 = new String("Hello Java");
        IO.println("new keyword'dan: " + str1);

        // Constructor 2: character array'idan String tuziw
        char[] charArray = {'J', 'A', 'V', 'A'};
        String str2 = new String(charArray);
        IO.println("char array'idan: " + str2);

        // Constructor 3: byte array'idan String tuziw
        byte[] byteArray = {72, 101, 108, 108, 111};
        String str3 = new String(byteArray);
        IO.println("byte array'idan: " + str3);
    }
}
