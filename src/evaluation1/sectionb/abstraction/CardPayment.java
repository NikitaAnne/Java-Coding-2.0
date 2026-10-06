package evaluation1.sectionb.abstraction;

public class CardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println(amount + " paid through card");
    }
}
