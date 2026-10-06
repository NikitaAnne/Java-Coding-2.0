package evaluation1.sectionb.encapsulation;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Nikita");
        account.deposit(2000);
        account.withdraw(1000);
        //account.withdraw(3000); //if amount exceeds balance
        System.out.println(account.getName() +"'s account balance is "+ account.getBalance());
    }
}
