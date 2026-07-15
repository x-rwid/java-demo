package primitives;

public class DataTypeFP {
    static void main() {
        // Floating-Point

        float x = 101.230F; // 10 lik sanoqda literal
        float y = 0123.222F; // bu yetakci 0 qaramay 10 lik kasr
        double z = 0x1.8p3; // ular 2 lik darojani belgilaw ucun p dan foydalanadi: 1.8 (hex) * 2 ^ 3 = 12.0
        IO.println(x);
        IO.println(y);
        IO.println(z);

        // floating-point'da ilmiy yozuv ucun E iwlatiladi
        double ex = 5E-3; // 5 * 10 ^ -3 = 0.005, bu yerda E dan keyingi son 10 ni darojasi
        IO.println(ex);
        double ex1 = 0.1E2; // 0.1 * 10 ^ 2 = 10.0, bu yerda E dan keyingi son 10 ni darojasi
        IO.println(ex1);

        // double turida taqsimlaw
        double a1 = 5 / 4; // butun son butun songa taqsimlansa, javab: 1.0
        IO.println(a1);
        double a2 = 5.0 / 4; // nisbiy son butun songa taqsimlansa, javab: 1.25
        IO.println(a2);

        // computer'ni arithmetic jihatdan no to'g'ri hisablawi
        double b1 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        IO.println(b1); // to'g'ri javab: 1
        double b2 = 3.3 / 3;
        IO.println(b2); // to'g'ri javab: 1.1
    }
}
