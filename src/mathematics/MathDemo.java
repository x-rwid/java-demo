package mathematics;

public class MathDemo {
    static void main() {
        // Method'lar ila iwlaw

        double a = -191.635;
        double b = 43.74;
        int c = 16, d = 45;

        System.out.printf("%.3f ni " + "mutlaq qiymati %.3f%n",
                a, Math.abs(a));

        System.out.printf("%.2f ni " + "yuqori cegarasi %.0f%n",
                b, Math.ceil(b));

        System.out.printf("%.2f ni " + "quyi cegarasi %.0f%n",
                b, Math.floor(b));

        System.out.printf("%.2f ni " + "yaxlitlaniwi %.0f%n",
                b, Math.rint(b));

        System.out.printf("%d va " + "%d ni eng ko'pi %d%n",
                c, d, Math.max(c,d));

        System.out.printf("%d va " + "%d ni eng kami %d%n",
                c, d, Math.min(c,d));
    }
}
