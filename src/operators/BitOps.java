package operators;

public class BitOps {
    static void main() {
        // Bitwise & Bit Shift Operator'lar

        boolean i9 = true ^ true; // false
        boolean i10 = false ^ false; // false
        boolean i11 = true ^ false; // true
        boolean i12 = false ^ true; // true
        IO.println(i9);
        IO.println(i10);
        IO.println(i11);
        IO.println(i12);

        // Birlik bitwise to'ldiruvci operator'i
        int val1 = 5;     // ikkilik sanoqda: 00000101
        int val2 = ~val1; // ikkilik sanoqda: 11111010
        IO.println(val2);

        // Bitwise VA operator'iga 16 lik sanoqda misal
        int bitmask = 0x000F;
        int bit = 0x2222;
        IO.println(bit & bitmask);

        // Bitwise VA operator'iga 10 lik sanoqda misal
        int bit1 = 5;
        int bit2 = 9;
        IO.println(bit1 & bit2);

        // Bitwise XYO operator'iga misal
        int bit3 = 5;
        int bit4 = 9;
        IO.println(bit3 ^ bit4);

        // Bitwise YO operator'iga misal
        int bit5 = 5;
        int bit6 = 9;
        IO.println(bit5 | bit6);

        // Imzolangan capga siljiw operator'i
        int a2 = 1;
        int b2 = 2;
        IO.println(a2 << b2); // a2 << b2 => 1 << 2 => 1 * (2 ^ 2) = 4

        // Imzolangan o'ngga siljiw operator'i
        int a3 = 17; // 10001
        int b3 = 2;
        IO.println(a3 >> b3); // natija 4

        // Bitwise & Bit Shift operator'lariga misal
        int h = 0b1010;
        int g = 0b1100;

        IO.println("~h : " + (~h));
        IO.println("h << 2 : " + (h << 2));
        IO.println("g >> 1 : " + (g >> 1));
        IO.println("g >>> 1 : " + (g >>> 1));
        IO.println("h & g : " + (h & g));
        IO.println("h ^ g : " + (h ^ g));
        IO.println("h | g : " + (h | g));
    }
}
