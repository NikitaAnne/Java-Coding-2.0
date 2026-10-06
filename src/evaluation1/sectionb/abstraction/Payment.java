package evaluation1.sectionb.abstraction;

public abstract class Payment {
    public void display() {
        System.out.println("Payment successful!");
    }

    abstract void pay(double amount);
}
