package variables;

import java.util.List;

public class VarTypeId {
    static void main() {
        // Var Type Identifier

        IO.print("Hey! ");
        var name = IO.readln("Ismin nima? ");
        IO.println("Salam, " + name + "!");

        var list = List.of("yak ", "du ", "se ", "cor ", "pay \n"); // \n Method dasturi quyidan cop etiliwi ucun
        for (var element : list) {
            IO.print(element);
        }
    }
}
