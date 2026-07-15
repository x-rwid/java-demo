package problems;

public class Recursion {
    // 1-Masala: n factorial'ni recursion algoritm'ida hisablaw

//    static int fact(int x) {
//        if (x == 1) {                // asosiy holat,
//            return 1;                // ya'ni to'xtaw warti.
//        } else {                     // recursive holat,
//            return x * fact(x-1); // ya'ni caqiruv qismi.
//        }
//    }
//
//    static void main() {
//        IO.println(fact(5));
//    }

    // 2-Masala: 10 dan 1 gaca teskari sanaw dasturi
    static void count(int n) {
        IO.println(n);

        if (n <= 1) {
            return; // asosiy holat: n 1 ga teng yo undan kicik bo'lganda to'xtaydi
        } else {
            count(n - 1); // recursive holat: o'zini n - 1 ila caqiradi
        }
    }
    static void main() {
        count(10); // caqiruvlar soni count(10) ga teng qiyamtli
    }
}
