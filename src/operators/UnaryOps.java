package operators;

public class UnaryOps {
    static void main() {
        // Unary Operator'lar

        int result4 = +1;
        IO.println(result4); // natija 1

        result4--;
        IO.println(result4); // natija 0

        result4++;
        IO.println(result4); // natija 1

        result4 = -result4;
        IO.println(result4); // natija -1

        IO.println(); // bo'w joy tawlaw ucun

        // mantiqiy inkor operator'i
        boolean success = false;
        IO.println(success); // false
        IO.println(!success); // true

        IO.println(); // bo'w joy tawlaw ucun

        // prefix
        int m = 4;
        int n = ++m;   // m = 4 + 1, n = 5
        IO.println(m); // natija 5
        IO.println(n); // natija 5

        // postfix
        int m1 = 4;
        int n1 = m1++;  // n1 = 4, m1 = 4 + 1
        IO.println(m1); // natija 5
        IO.println(n1); // natija 4

        // prefix va postfix
        int m2 = 15;
        int n2 = 15;
        IO.println(m2++ + ++m2); // 15 + 17 = 32
        IO.println(n2++ + n2++); // 15 + 16 = 31

        // prefix va postfix - owiw
        int k = 3;
        k++;
        IO.println(k); // natija 4

        ++k;
        IO.println(k); // natija 5

        IO.println(++k); // natija 6

        IO.println(k++); // natija 6

        IO.println(k); // natija 7

        // prefix va postfix - owiw, kamayiw
        int num = 10;
        IO.println(num++); // 10 (11)
        IO.println(++num); // 12
        IO.println(num--); // 12 (11)
        IO.println(--num); // 10

        // prefix va postfix ila murokkab tayinlaw operator'i
        int k1 = 1;
        k1 += ++k1 + k1++;
        IO.println(k1);
    }
}
