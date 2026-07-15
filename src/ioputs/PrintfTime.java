package ioputs;

import java.time.LocalDateTime;

public class PrintfTime {
    static void main() {
        // Vaqt qiymatlarni wakllaw - hozirgi vaqtni biliw

        LocalDateTime time = LocalDateTime.now();

        System.out.printf("Yil = %tY \n", time);
        System.out.printf("Oy = %tm \n", time);
        System.out.printf("Kun = %td \n", time);
        System.out.printf("Vaqt = %tT \n", time);
        System.out.printf("Soat = %tH \n", time);
        System.out.printf("Daqiqa = %tM \n", time);
        System.out.printf("Saniya = %tS \n", time);
    }
}
