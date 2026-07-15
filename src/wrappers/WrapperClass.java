package wrappers;

public class WrapperClass {
    static void main() {
        // Wrapper Class

        byte b = 1;
        Byte byteObj = Byte.valueOf(b);

        int i = 10;
        Integer intObj = Integer.valueOf(i);

        float f = 18.6F;
        Float floatObj = Float.valueOf(f);

        double d = 250.5;
        Double doubleObj = Double.valueOf(d);

        char c = 'a';
        Character charObj = c; // qutiga soliw

        IO.println("Wrapper Object'lar:");
        IO.println(byteObj);
        IO.println(intObj);
        IO.println(floatObj);
        IO.println(doubleObj);
        IO.println(charObj);

        // qutidan ciqariw
        byte bv = byteObj;
        int iv = intObj;
        float fv = floatObj;
        double dv = doubleObj;
        char cv = c;

        IO.println("\nO'ralmagan qiymatlar:");
        IO.println(bv);
        IO.println(iv);
        IO.println(fv);
        IO.println(dv);
        IO.println(cv);
    }
}
