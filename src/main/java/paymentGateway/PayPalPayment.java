package paymentGateway;

public class PayPalPayment implements IPaymentGateway{

    @Override
    public String processPayments(double amount) {
        return "Payment of " + amount + " processed via PayPal";
    }

    @Override
    public String refundPayment(String transactionId) {
        return "refund for transaction ID : " + transactionId + " ; is done via PayPal";
    }
}
