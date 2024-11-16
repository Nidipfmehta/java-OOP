package inheritance;

public class netbanking implements IPaymentPlatform{
    @Override
    public void paymentPlatform() {
        System.out.println("payment platform : netbanking");
    }
}
