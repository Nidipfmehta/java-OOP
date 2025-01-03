package paymentGateway;

public class CreditCardPayment implements IPaymentGateway{

    @Override
    public String processPayments(double amount) {
        return "Payment of " + amount + " processed via Credit Card";
    }

    @Override
    public String refundPayment(String transactionId) {
        return "refund for transaction ID : " + transactionId + " ; is done via Credit Card";
    }
}
