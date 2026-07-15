package ioputs;

public class PrintfNumeric {
    static void main() {
        // Numeric qiymatlarni wakllaw

        Integer x = 12345;
        Double y = 123.123456;

        System.out.printf("Integer = %d \n", x);
        System.out.printf("Double = %f \n", y);
        System.out.printf("Double = % .1f \n", y);
        System.out.printf("Double = % .2f \n", y);
    }
}