
public class Customer {
    private String name;
    private BankAccount account;

    public Customer(String name, String accountNumber, double initialBalance) {
        this.name = name;
        this.account = new BankAccount(accountNumber, initialBalance);
    }

    public String getName() {
        return name;
    }

    public void depositToAccount(double amount) {
        account.deposit(amount);
    }

    public void withdrawFromAccount(double amount) {
        account.withdraw(amount);
    }

    public void checkBalance() {
        System.out.println("Account Balance for " + name + ": $" + account.getBalance());
    }
}
