package operators;

import objects.Student;
import objects.StudentDemo;

public class CompOps {
    static void main() {
        // Comparison Operator

        Student obj1 = new Student();

        if (obj1 instanceof Student) {
            IO.println("true");
        } else {
            IO.println("false");
        }

        // Taqqoslaw operator'iga misal
        Student obj2 = new Student();
        check(obj2);
    }

    private static void check(Object o) {
        if (o instanceof StudentDemo) {
            IO.println("true");
        } else {
            IO.println("false");
        }
    }
}
