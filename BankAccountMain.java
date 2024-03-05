import java.util.ArrayList;
import java.util.Scanner;

// Interface for Account
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    double getBalance();
    void displayAccountDetails();
}

// BankAccount class implementing the Account interface
class BankAccount implements Account {
    protected double balance;

    // Constructor
    public BankAccount() {
        this.balance = 0.0;
    }

    // Implementing methods from the Account interface
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    @Override
    public void calculateInterest() {
        // Default implementation (no interest for generic bank account)
        System.out.println("No interest for the generic bank account.");
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Account Type: Generic Bank Account");
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount class extending BankAccount and implementing the Account interface
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(double interestRate) {
        super(); // Calls the constructor of the superclass (BankAccount)
        this.interestRate = interestRate;
    }

    // Unique method for SavingsAccount
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
        System.out.println("Interest rate set to: " + interestRate + "%");
    }

    // Implementing the calculateInterest method for SavingsAccount
    @Override
    public void calculateInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest calculated and added. Current balance: " + balance);
    }

    // Overriding displayAccountDetails for better information
    @Override
    public void displayAccountDetails() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// CurrentAccount class extending BankAccount and implementing the Account interface
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(double overdraftLimit) {
        super(); // Calls the constructor of the superclass (BankAccount)
        this.overdraftLimit = overdraftLimit;
    }

    // Unique method for CurrentAccount
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
        System.out.println("Overdraft limit set to: " + overdraftLimit);
    }

    // Implementing the withdraw method for CurrentAccount with overdraft protection
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or exceeds overdraft limit.");
        }
    }

    // Overriding displayAccountDetails for better information
    @Override
    public void displayAccountDetails() {
        System.out.println("Account Type: Current Account");
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

// Main class for testing
public class BankAccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a list to store accounts
        ArrayList<Account> accounts = new ArrayList<>();

        // Add some accounts to the list
        accounts.add(new SavingsAccount(3.5));
        accounts.add(new CurrentAccount(500));

        // Perform operations on accounts
        for (Account account : accounts) {
            account.displayAccountDetails();

            System.out.print("Enter deposit amount: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);

            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();
            account.withdraw(withdrawalAmount);

            account.calculateInterest();
            account.displayAccountDetails();

            System.out.println("-------------------------------");
        }

        // Close the scanner
        scanner.close();
    }
}
