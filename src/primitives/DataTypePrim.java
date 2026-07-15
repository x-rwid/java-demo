package primitives;

public class DataTypePrim {
    static void main() {

        // integer
        byte k = 127;
        short m = 2;
        int i = 3;
        long n = 4L; // long turiga L qo'wimcasi talab etiladi int turidan farqlaw ucun

        // floating-point
        float f = 2.1F; // float turiga F qo'wimcasi talab etiladi double turidan ajratiw ucun
        double u = 43.2; // double turiga d qo'wimcasi talab etiladi, ammo sukut bo'yica bo'lgani ucun wartmas

        // character
        char d = '1';

        // boolean
        boolean l = true;

        int result = k + m;
        int r = k + (int) f;
        float h = k + f;

        IO.println(result);
        IO.println(r);
        IO.println(h);

        // int turidagi amalni natijasini float turida cop etiw
        int a = 5;
        int b = 2;
        float natija = (float) a / b;
        IO.println(natija);
    }
}
