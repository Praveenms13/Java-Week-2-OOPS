class BankAccount {
    private static String bankName = "Test Bank";
    private static int totalAccounts = 0;
    private final String accountNumber;
    private String accountHolderName;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }
}

class BankAccount1 extends BankAccount {
    public BankAccount1(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("987", "SBI");
        BankAccount1 b = new BankAccount1("123", "Indian Bank");

        a.displayDetails();
        b.displayDetails();

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());

        System.out.println(a instanceof BankAccount1);
        System.out.println(b instanceof BankAccount1);
    }
}
