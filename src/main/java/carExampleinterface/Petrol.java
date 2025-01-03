package carExampleinterface;

public class Petrol implements IFuelUp{
    @Override
    public void FuelUp() {
        System.out.println("fuel type is petrol");
    }
}
