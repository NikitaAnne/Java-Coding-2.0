package evaluation1.sectiond.paymentservice;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void processOrder(double amount) {

        System.out.println("Processing order...");

        paymentService.pay(amount);

        System.out.println("Order completed.");
    }
}
