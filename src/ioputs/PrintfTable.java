package ioputs;

public class PrintfTable {
    static void main() {
        // Qiymatlarni wakllab, jadval ko'riniwida cop etiw

        System.out.printf("----------------------%n");
        System.out.printf("| Bazarlik Ruyxati   | %n");
        System.out.printf("----------------------%n");
        System.out.printf("| %-10s | %4s  |%n", "Mahsulat", "Dona");
        System.out.printf("----------------------%n");
        System.out.printf("| %-10s |%4d   |%n", "Non", 4);
        System.out.printf("| %-10s |%4d   |%n", "Qaymoq", 2);
        System.out.printf("| %-10s |%4d   |%n", "Qahva", 1);
        System.out.printf("----------------------%n");
    }
}
