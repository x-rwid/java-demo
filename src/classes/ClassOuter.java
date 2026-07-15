package classes;

public class ClassOuter {

    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";

    class InnerClass {
        void accessMembers(){
            IO.println(outerField);
            IO.println(staticOuterField);
        }
    }
    static class StaticNestedClass {
        void accessMembers(ClassOuter outer){
            IO.println(outer.outerField);
            IO.println(staticOuterField);
        }
    }
    static void main() {
        IO.println("Inner Class:");
        IO.println("------------");
        ClassOuter outerObject = new ClassOuter();
        ClassOuter.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();

        IO.println("\nStatic Nested Class:");
        IO.println("--------------------");
        StaticNestedClass staticNestedObject = new StaticNestedClass();
        staticNestedObject.accessMembers(outerObject);

        IO.println("\nTop-Level Class:");
        IO.println("--------------------");
        ClassTopLevel topLevelObject = new ClassTopLevel();
        topLevelObject.accessMembers(outerObject);
    }
}
