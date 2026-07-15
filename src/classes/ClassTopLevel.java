package classes;

public class ClassTopLevel {

    void accessMembers(ClassOuter outer) {
        IO.println(outer.outerField);
        IO.println(ClassOuter.staticOuterField);
    }
}
