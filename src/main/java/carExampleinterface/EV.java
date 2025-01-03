package carExampleinterface;

public class EV implements IFuelUp{
    @Override
    public void FuelUp() {
        System.out.println("fuel type is EV");
    }
}
