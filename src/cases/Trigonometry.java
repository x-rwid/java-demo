package cases;

public class Trigonometry {
    static void main() {
        // Math - 45 darojali burcak ucun turli trigonometric qiymatlarni hisablaw dasturi

        double degrees = 45.0;
        double radians = Math.toRadians(degrees);

        System.out.format("pi sonini qiymati: " + "%.4f%n", Math.PI);

        System.out.format("%.1f ni daroja sinus'i: " + "%.4f%n", degrees, Math.sin(radians));

        System.out.format("%.1f ni daroja cosinus'i: " + "%.4f%n", degrees, Math.cos(radians));

        System.out.format("%.1f ni daroja tangens'i: " + "%.4f%n", degrees, Math.tan(radians));

        System.out.format("%.4f ni arcsinus'i: " + "%.4f daroja %n", Math.sin(radians),
                Math.toDegrees(Math.asin(Math.sin(radians))));

        System.out.format("%.4f ni arccosinus'i: " + "%.4f daroja %n", Math.cos(radians),
                Math.toDegrees(Math.acos(Math.cos(radians))));

        System.out.format("%.4f ni arctangens'i: " + "%.4f daroja %n", Math.tan(radians),
                Math.toDegrees(Math.atan(Math.tan(radians))));
    }
}
