package generics;

public class Lawyer extends Employee{
    String field;
    public Lawyer(String name, double salary) {
        super(name, salary);
        this.field = field;
    }

    @Override
    public double getInHandSalary() {
        return salary * 0.95;
    }

    @Override
    public int leavePolicy() {
        return 8;
    }
}
