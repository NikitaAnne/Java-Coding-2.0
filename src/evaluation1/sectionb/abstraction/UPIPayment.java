package evaluation1.sectionb.abstraction;

public class UPIPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println(amount + " paid through UPI");
    }
}
