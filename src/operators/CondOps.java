package operators;

public class CondOps {
    static void main() {
        // Conditional Operator'lar

        int valueA = 1;
        int valueB = 2;

        if ((valueA == 1) && (valueB == 2))
            IO.println("qiymatA bu 1 VA qiymatB bu 2");
        if ((valueA == 1) || (valueB == 1))
            IO.println("qiymatA bu 1 YO qiymatB bu 1");

        // Wartli operator'larni birlik mantiqiy INKOR operator'i ila
        boolean open = true;
        boolean close = false;

        boolean bool = !false;

        // avval qavslardagi wart baholanadi, keyin open VA qavslardan ciqqan qiymat baholanadi
        boolean bool1 = open && (close || bool);
        IO.println(bool1);
        // mantiqiy INKOR qavslardan ciqqan qiymatni teskari qiladi, keyin open VA teskari qiymat baholanadi
        boolean bool2 = open && !(close || bool);
        IO.println(bool2);

        // VA, YO operator'larini bir biridan farqi
        boolean i1 = true && true; // true
        boolean i2 = false && false; // false
        boolean i3 = true && false; // false
        boolean i4 = false && true; // false
        IO.println(i1);
        IO.println(i2);
        IO.println(i3);
        IO.println(i4);

        boolean i5 = true || true; // true
        boolean i6 = false || false; // false
        boolean i7 = true || false; // true
        boolean i8 = false || true; // true
        IO.println(i5);
        IO.println(i6);
        IO.println(i7);
        IO.println(i8);
    }
}
