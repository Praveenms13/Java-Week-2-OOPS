class BankAccount {
    public String accountNumber = "1234567890";
    protected String accountHolder = "John Doe";
    private double balance = 1000.0;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        } else {
            System.out.println("Invalid balance amount!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}

class SavingsAccount extends BankAccount {
    public void showAccountInfo() {
        System.out.println("Accessing from SavingsAccount subclass...");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

public class main3 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(500.0);
        acc.withdraw(300.0);
        acc.setBalance(2000.0);
        System.out.println("Updated Balance: " + acc.getBalance());

        SavingsAccount savings = new SavingsAccount();
        savings.showAccountInfo();
    }
}
