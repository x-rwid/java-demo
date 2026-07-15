package strings;

public class StringFormat {
    static void main() {
        // String Format

        String fs;
        fs = "float variable'ni " + "qiymati %f, " +
                "integer variable'ni " + "qiymati %d, " +
        "va string %s";

        var floatVar1 = 3.14F;
        var intVar1 = 314;
        var stringVar1 = "314";
        IO.println(String.format(fs, floatVar1, intVar1, stringVar1));
        var floatVar2 = 2.72F;
        var intVar2 = 272;
        var stringVar2 = "272";
        IO.println(String.format(fs, floatVar2, intVar2, stringVar2));
    }
}
