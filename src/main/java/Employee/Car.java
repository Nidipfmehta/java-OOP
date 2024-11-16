package Employee;

public class Car {

    private static int Idcounter = 1;

    private int id;
    private CarType cartype;
    private String colour;

    public Car(CarType cartype, String colour) {
        this.cartype = cartype;
        this.colour = colour;
        this.id = Idcounter++;
    }

    public int getId() {
        return id;
    }

    public CarType getCartype() {
        return cartype;
    }

    public String getColour() {
        return colour;
    }

    public String printCar() {
        return "car : id -> " + id + ", car type -> " + cartype + ", colour -> " + colour + "\n";
    }
}
