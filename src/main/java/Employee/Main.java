package Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Harit", "Software Engineer");
        //emp.displayEmployee();
        emp.buyCar(CarType.SUV, "Red");
        emp.displayEmployee();
        Employee emp1 = new Employee("pratham", "CA");
        //emp1.displayEmployee();
        emp1.buyCar(CarType.SUV, "Red");
        emp1.displayEmployee();
        Employee emp2 = new Employee("nidip", "builder");
        //emp2.displayEmployee();
        emp2.buyCar(CarType.SUV, "Red");
        emp2.buyCar(CarType.SUV, "Black");
        emp2.displayEmployee();
    }
}