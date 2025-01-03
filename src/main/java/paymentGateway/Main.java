package paymentGateway;

public class Main {
    public static void main(String[] args) {

        IPaymentGateway creditCard = new CreditCardPayment();
        IPaymentGateway payPal = new PayPalPayment();
        IPaymentGateway upi = new UPIPayment();

        System.out.println(creditCard.processPayments(100));
        System.out.println(payPal.processPayments(200));
        System.out.println(upi.processPayments(300));

        System.out.println(creditCard.refundPayment("CC1234"));
        System.out.println(payPal.refundPayment("PP1234"));
        System.out.println(upi.refundPayment("UP1234"));

    }
}
