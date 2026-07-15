package strings;

public class ToString {
    static void main() {
        // Raqamlarni string'larga aylantiriw

        double d = 858.48;
        String s = Double.toString(d);

        int dot = s.indexOf('.');

        IO.println(dot + " ta raqam " + "o'nlik sanoq nuqtasidan oldin.");
        IO.println((s.length() - dot - 1) + " ta raqam o'nlik sanoq nuqtasidan keyin.");
    }
}
