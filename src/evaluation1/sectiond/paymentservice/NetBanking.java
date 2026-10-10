package evaluation1.sectiond.paymentservice;

public class NetBanking implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " through Net Banking");
    }
}
