
class import java.util.Scanner;

class BankAccount {

    protected double balance;

    public BankAccount(double balance) {
        if (balance > 0)
            this.balance = balance;
        else
            this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount > 0 && (balance - amount) >= 100) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Withdrawal denied! Minimum balance of ₹100 must be maintained.");
        }
    }
}

public class BankTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingsAccount account = new SavingsAccount(500);

        System.out.println("Initial Balance: ₹" + account.getBalance());

        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("Final Balance: ₹" + account.getBalance());

        sc.close();
    }
} {

    protected double balance;

    // Constructor
    public BankAccount(double balance) {
        if (balance > 0)
            this.balance = balance;
        else
            this.balance = 0;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

// Subclass
class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    // Overriding withdraw method
    @Override
    public void withdraw(double amount) {

        if (amount > 0 && (balance - amount) >= 100) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Withdrawal denied! Minimum balance of ₹100 must be maintained.");
        }
    }
}

// Test Class
public class BankTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingsAccount account = new SavingsAccount(500);

        System.out.println("Initial Balance: ₹" + account.getBalance());

        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("Final Balance: ₹" + account.getBalance());

        sc.close();
    }
}