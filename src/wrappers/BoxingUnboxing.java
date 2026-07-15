package wrappers;

public class BoxingUnboxing {
    static void main() {

        // Autoboxing
        int b = 357;
        Integer a = b; // qutiga soliw: primitive int -> object
        IO.println("primitive int b: " + b);
        IO.println("Integer object: " + a);

        // Unboxing
        int foo = 42; // primitive tur
        Integer bar = foo;
        // foo bar'ga box'langan, bar Integer turdagi int ucun wrapper sifatida xizmat qiladi
        int foo2 = bar; // unbox'lanib primitive turga qaytdi

        IO.println(foo2);
    }
}
