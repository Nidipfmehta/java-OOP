package inheritance;

public class cards implements IPaymentPlatform{
    @Override
    public void paymentPlatform() {
        System.out.println("payment platform : cards");
    }
}
