package inheritance;

public class OrderPay {

    private static int order_id = 1;
    private int orderNumber;

    private IOrderPlatform iOrderPlatform;
    private IPaymentPlatform iPaymentPlatform;
    private int order_price;
    private String name;

    public OrderPay(IOrderPlatform iOrderPlatform, IPaymentPlatform iPaymentPlatform, int order_price, String name)
    {
        this.orderNumber = order_id;
        order_id++;
        this.order_price = order_price;
        this.name = name;
        this.iOrderPlatform = iOrderPlatform;
        this.iPaymentPlatform = iPaymentPlatform;
    }

    public void display()
    {
        System.out.println("order id "+order_id);
        System.out.println("order price = "+order_price);
        System.out.println("order name : "+name);
        iOrderPlatform.orderPlatform();
        iPaymentPlatform.paymentPlatform();

    }
}
