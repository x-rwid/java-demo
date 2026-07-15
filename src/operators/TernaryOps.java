package operators;

public class TernaryOps {
    static void main() {
        // Ternary Operator

        int valueA1 = 1;
        int valueB2 = 2;
        int result5;

        boolean someCondition = true;
        result5 = someCondition ? valueA1 : valueB2;
        IO.println(result5);

        // Uclik operator'ida Kabisa yil misali
        int februaryDays = 29;
        String result0;

        result0 = (februaryDays == 28) ? "Kabisa yil emas" : "Kabisa yil";
        IO.println(result0);

        // Uclik operator'ida misal
        int num20 = 20, num10 = 10, num30 = 30, result6;

        // result eng 3 ta sonni yig'indisini saqlaydi
        result6 = ((num20 > num10) ? (num20 > num30) ? num20 : num30 : (num10 > num30) ? num10 : num30);
        IO.println("3 ta sonni yig'indisi = " + result6);
    }
}
