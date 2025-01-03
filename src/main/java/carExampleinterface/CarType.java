package carExampleinterface;

public class CarType {
    protected int carId;
    protected double fuelCapacity;
    protected String color;
    IFuelUp iFuelUp;

    public CarType(int carId, double fuelCapacity, String color, IFuelUp iFuelUp) {
        this.fuelCapacity = fuelCapacity;
        this.carId = carId;
        this.color = color;
        this.iFuelUp = iFuelUp;
    }

    public void displayCarDetails() {
        System.out.println("carId : " + carId);
        System.out.println("fuel capacity : " + fuelCapacity);
        System.out.println("color : " + color);
        iFuelUp.FuelUp();
    }

}
