package carExampleinterface;

public class Main {
    public static void main(String[] args) {
        CarType evCar = new CarType(1, 1.5, "red", new EV());
        evCar.displayCarDetails();
        System.out.println();
        CarType petrolCar = new CarType(2, 5.1, "cyan", new Petrol());
        petrolCar.displayCarDetails();
        System.out.println();
        CarType dieselCar = new CarType(3, 2.5, "pink", new Diesel());
        dieselCar.displayCarDetails();
        System.out.println();
    }
}
