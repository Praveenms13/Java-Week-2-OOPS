class Customer {
    String name;
    double balance;

    Customer(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    void viewBalance() {
        System.out.println(name + "'s balance: " + balance);
    }

    void deposit(double amount) {
        balance += amount;
    }
}

class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer c, double initialDeposit) {
        System.out.println("Opening account for " + c.name + " in " + name);
        c.deposit(initialDeposit);
    }
}
