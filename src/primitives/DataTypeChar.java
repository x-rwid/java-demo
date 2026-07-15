package primitives;

public class DataTypeChar {
    static void main() {

        // Character
        char ch = '\u0040'; // Unicode - '\u0000' dan 'uFFFF' gaca
        IO.println(ch);

        char hex = 65; // 16 lik sanoq tizimida - 0 dan 65.535 gaca
        IO.println(hex);

        char upperCaseLetter = 'B';
        char lowerCaseLetter = 'b';
//        lowerCaseLetter += 'b'; // 1ci usul - qiymat owiriw
//        lowerCaseLetter -= 'l'; // 1ci usul - qiymat kamaytiriw
//        IO.println(upperCaseLetter);
//        IO.println(lowerCaseLetter);
        lowerCaseLetter = (char) (lowerCaseLetter + 1); // 2ci usul - qiymat owiriw
        IO.println(upperCaseLetter);
        IO.println(lowerCaseLetter);

        char capitalC = 'C'; // bittali qo'wtirnoq icidagi bittali character literal
        IO.println(capitalC);
        IO.println("\" bu belgi!"); // Character literal'ini qociwi

        // Unicode belgisini qociwi - linefeed \n
        String multilineText = "Birinci satr.\nIkkinci satr.\nUcinci satr.";
        IO.println(multilineText);
    }
}
