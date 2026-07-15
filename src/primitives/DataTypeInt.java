package primitives;

public class DataTypeInt {
    static void main() {

        // 18 raqam 10 lik sanoq tizimida
        int decimalValue = 18;
        // 18 raqam 2 lik sanoq tizimida
        int binaryValue = 0b10010;
        // 18 raqam 8 lik sanoq tizimida
        int octalValue = 022;
        // 18 raqam 16 lik sanoq tizimida
        int hexValue = 0x12;

        IO.println(decimalValue);
        IO.println(binaryValue);
        IO.println(octalValue);
        IO.println(hexValue);

        // year degan variable va uni qiymatini 1 taga owiriw
        int year;
        year = 2026;
        year = year + 1;
        IO.println("Keyingi yil: " + year + " yil");

        // Integer'lar
        byte number = 1;
        IO.println(number);
        number = 3;
        IO.println(number);

        short shortNumber = 20;
        IO.println(shortNumber);
        shortNumber = 40 + 10; // xotira <= 2
        IO.println(shortNumber);

        int million = 1_000_000; // 1000000 - wunday ko'riniwda ham yozsa bo'ladi
        IO.println(million);
        million = million / 10; // 1 byte + 2 byte = 3 byte | xotira <= 4
        IO.println(million);

        long bigNumber = 1326L;
        IO.println(bigNumber);
        bigNumber = number + shortNumber + million; // 1 byte + 2byte + 4 byte = 7 byte | xotira <= 8
        IO.println(bigNumber);
    }
}
