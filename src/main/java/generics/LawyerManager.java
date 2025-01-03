package generics;

public class LawyerManager extends Lawyer{
    private double bonus;

    public LawyerManager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getInHandSalary() {
        return super.getInHandSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Employee ID: " + e_id + ", Name: " + name + ", Salary: " + salary + ", In-hand Salary: " + getInHandSalary();
    }
}
