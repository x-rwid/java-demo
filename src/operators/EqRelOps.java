package operators;

public class EqRelOps {
    static void main() {
        // Equality & Relational Operator'lar

        int value1 = 1;
        int value2 = 2;

        if (value1 == value2)
            IO.println("qiymat1 == qiymat2");
        if (value1 != value2)
            IO.println("qiymat1 != qiymat2");
        if (value1 > value2)
            IO.println("qiymat1 > qiymat2");
        if ((value1 < value2))
            IO.println("qiymat1 < qiymat2");
        if (value1 <= value2)
            IO.println("qiymat1 <= qiymat2");

        // true va false
        int w = 7, z = 11; // variable'lar tuziw
        IO.println("w bu " + w + " va z bu " + z); // w va z qiymatlari

        IO.println(w == z); // false
        IO.println(w != z); // true
        IO.println(w > z); // false
        IO.println(w < z); // true
        IO.println(w >= z); // false
        IO.println(w <= z); // true
    }
}
