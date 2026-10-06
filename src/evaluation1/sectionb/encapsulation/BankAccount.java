package evaluation1.sectionb.encapsulation;

public class BankAccount {
    private String name;
    private double balance = 0.0;

    BankAccount(String name) {
        this.name = name;

    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
        return balance;
    }

    public double withdraw(double amount) {
        {
            balance = balance - amount;
        }
        if (amount > balance) {
            System.out.println("Insuffiicent balance!");

        }
        return balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

}
