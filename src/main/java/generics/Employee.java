package generics;

public class Employee {
    String name;
    int e_id;
    double salary;
    static int id=1;

    public Employee(String name, double salary) {
        this.name = name;
        this.e_id = id;
        this.salary = salary;
        id++;
    }

    public double getInHandSalary() {
        return salary * 0.9;
    }

    public int leavePolicy() {
        return 10;
    }

    public void getDetails() {
        System.out.println("Employee id : " + e_id + " Name : " + name + "in hand salary : " + salary);
    }

//    public abstract double getInHandSalary(double salary);

    @Override
    public String toString() {
        return "Employee ID: " + e_id + ", Name: " + name + ", Salary: " + salary + ", In-hand Salary: " + getInHandSalary() + ", Leave : " + leavePolicy();
    }
}
