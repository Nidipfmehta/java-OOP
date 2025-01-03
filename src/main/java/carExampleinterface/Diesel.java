package carExampleinterface;

public class Diesel implements IFuelUp{
    @Override
    public void FuelUp() {
        System.out.println("fuel type is diesel");
    }
}
