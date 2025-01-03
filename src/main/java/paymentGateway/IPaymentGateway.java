package paymentGateway;

public interface IPaymentGateway {

    String processPayments(double amount);
    String refundPayment(String transactionId);
}
