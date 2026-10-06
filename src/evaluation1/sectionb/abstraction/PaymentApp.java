package evaluation1.sectionb.abstraction;

public class PaymentApp {
    public static void main(String[] args) {
        Payment cardPay = new CardPayment();
        Payment uPay = new UPIPayment();
        uPay.pay(400);
        cardPay.pay(500);
    }
}
