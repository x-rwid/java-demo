package objects;

public class Employee extends Employer {
    // xodim

    int bonus = salary * 2;

    static void main() {

        Employee emp = new Employee();
        IO.println(emp.bonus);
    }
}
