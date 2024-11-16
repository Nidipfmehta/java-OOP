package Employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String designation;
    private List<Car> cars;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
        this.cars = new ArrayList<>();
    }

    public void buyCar(CarType cartype, String colour) {
        Car newCar = new Car(cartype, colour);
        cars.add(newCar);
    }

//    public Car showCar() {
//        return cars;
//    }

    public void displayEmployee() {
        System.out.println("Name : " + name + ", Designation : " + designation);
        System.out.println("Name : " + name + ", Designation : " + designation);
        if (cars.isEmpty()) {
            System.out.println("Doesn't have any cars");
            return;
        }
        System.out.println("cars : ");
        for (Car car : cars) {
            System.out.println(car.printCar());
        }
    }
}