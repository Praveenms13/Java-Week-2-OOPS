class BankAccount {
    protected String accountNumber;
    protected int accountBalance;
    public BankAccount(String accountNumber, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    public void displayAccountType() {
        System.err.println("I am from main class ...");
        System.out.println();
    }
}
class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(String accountNumber, int accountBalance, double interestRate) {
        super(accountNumber,accountBalance);
        if (interestRate < 0) {
            System.out.println("Provide Valid Interest rate ...");
            System.exit(0);
        }
        this.interestRate = interestRate;
    }
    public void displayAccountType() {
        System.out.println("---------- Savings Account ----------");
        System.out.println("Your Account Number: " + accountNumber);
        System.out.println("Your Account Balance: " + accountBalance);
        System.out.println("Interest Available For Savings Account: " + interestRate);
        System.out.println();
    }
}
class CheckingAccount extends BankAccount{
    private int withdrawalLimit;
    public CheckingAccount(String accountNumber, int accountBalance, int withdrawalLimit) {
        super(accountNumber,accountBalance);
        if (withdrawalLimit < 10000) {
            System.out.println("Provide Valid withdrawal limit ...");
            System.exit(0);
        }
        this.withdrawalLimit = withdrawalLimit;
    }
    public void displayAccountType() {
        System.out.println("---------- Checking Account ----------");
        System.out.println("Your Account Number: " + accountNumber);
        System.out.println("Your Account Balance: " + accountBalance);
        System.out.println("Your Maximum Withdrawal Limit is : " + withdrawalLimit);
        System.out.println();
    }
}
class FixedDepositAccount  extends BankAccount{
    private double interestRate;
    public FixedDepositAccount(String accountNumber, int accountBalance, double interestRate) {
        super(accountNumber,accountBalance);
        if (interestRate < 0) {
            System.out.println("Provide Valid Interest rate ...");
            System.exit(0);
        }
        this.interestRate = interestRate;  
    }
    public void displayAccountType() {
        System.out.println("---------- Fixed Deposit Account  ----------");
        System.out.println("Your Account Number: " + accountNumber);
        System.out.println("Your Account Balance: " + accountBalance);
        System.out.println("Interest Available For Savings Account: " + interestRate);
        System.out.println();
    }
}

public class Bank {
    public static void main(String[] args) {
        System.out.println();
        BankAccount bankAccountObj = new BankAccount("SBIN00025023", 10000); 
        bankAccountObj.displayAccountType();

        SavingsAccount SavingsAccountObj = new SavingsAccount("SBIN00025023", 10000, 7.5); 
        SavingsAccountObj.displayAccountType();

        CheckingAccount CheckingAccountobj = new CheckingAccount("SBIN00025023", 100000, 10000); 
        CheckingAccountobj.displayAccountType();

        FixedDepositAccount FixedDepositAccountObj = new FixedDepositAccount("SBIN00025023", 10000, 7.5); 
        FixedDepositAccountObj.displayAccountType();
    }
}