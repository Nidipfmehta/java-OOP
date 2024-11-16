package inheritance;

public class Main {
    public static void main(String[] args) {
        OrderPay order1 = new OrderPay(new zomato(), new upi(), 30, "pani puri");
        OrderPay order2 = new OrderPay(new swiggy(), new netbanking(), 50, "french fries");
        OrderPay order3 = new OrderPay(new zomato(), new cards(), 100, "chole puri");

        order1.display();
        System.out.println();
        order2.display();
        System.out.println();
        order3.display();
        System.out.println();
    }
}
