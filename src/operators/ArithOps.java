package operators;

public class ArithOps {
    static void main() {
        // Arithmetic Operator'lar

        int result3 = 1 + 2;
        IO.println("1 + 2 = " + result3);
        int original_result = result3;

        result3 = result3 - 1;
        IO.println(original_result + " - 1 = " + result3);
        original_result = result3;

        result3 = result3 * 2;
        IO.println(original_result + " * 2 = " + result3);
        original_result = result3;

        result3 = result3 / 2;
        IO.println(original_result + " / 2 = " + result3);
        original_result = result3;

        result3 = result3 + 8;
        IO.println(original_result + " + 8 = " + result3);
        original_result = result3;

        result3 = result3 % 7;
        IO.println(original_result + " % 7 = " + result3);

        // uwbu dasturda Integer tur ila iwlangani ucun natija butun son
        int x = 9;
        int y = 2;
        IO.println(x / y);

        // uwbu dasturda Floating-Point tur ila iwlangani ucun natija haqiqiy son
        double x1 = 9;
        double y1 = 2;
        IO.println(x1 / y1);

        // % operator'i bitta sonni ikkinci songa taqsimlaganda uni qoldig'ini aniqlaw ucun
        double x2 = 5;
        double y2 = 2;
        IO.println(x2 % y2); // 5 = 2 * 2 + 1

        // + operator'i String'larni birlawtiriw ucun ham iwlatiladi
        String firstString = "Mana bu";
        String secondString = " birlawtirilgan string.";
        String thirdString = firstString + secondString;
        IO.println(thirdString);
    }
}
