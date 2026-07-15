package mathematics;

public class ExponentiallDemo {
    static void main() {
        // Exponential va Logorifmic Method'lar

        double x = 11.635;
        double y = 2.76;

        System.out.printf("e ni qiymati " + "%.4f%n",
                Math.E);

        System.out.printf("exp(%.3f) bu " + "%.3f%n",
                x, Math.exp(x));

        System.out.printf("log(%.3f) bu " + "%.3f%n",
                x, Math.log(x));

        System.out.printf("pow(%.3f, %.3f) bu " + "%.3f%n",
                x, y, Math.pow(x, y));

        System.out.printf("sqrt(%.3f) bu " + "%.3f%n",
                x, Math.sqrt(x));
    }
}
