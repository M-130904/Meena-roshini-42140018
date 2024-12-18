public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0.0; // Initial balance
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Deposit Money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw Money
    // Withdraw Money
public void withdraw(double amount) {
    if (amount > 0 && balance >= amount) {
        balance -= amount;
        System.out.println("Successfully withdrew ₹" + amount);
        System.out.println("Updated Balance: ₹" + balance); // Show updated balance
    } else {
        System.out.println("Insufficient balance or invalid amount.");
    }
}


    // Check Balance
    public double getBalance() {
        return balance;
    }

    // Display Account Details
    public void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}
