package paymentGateway;

public class UPIPayment implements IPaymentGateway{

    @Override
    public String processPayments(double amount) {
        return "Payment of " + amount + " processed via UPI";
    }

    @Override
    public String refundPayment(String transactionId) {
        return "refund for transaction ID : " + transactionId + " ; is done via UPI";
    }
}
