import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    scanner.nextLine(); // Consume leftover newline
                    String name = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    BankAccount newAccount = new BankAccount(name, accountNumber);
                    bank.addAccount(newAccount);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    String accNumDeposit = scanner.next();
                    BankAccount accountDeposit = bank.findAccount(accNumDeposit);
                    if (accountDeposit != null) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        accountDeposit.deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    String accNumWithdraw = scanner.next();
                    BankAccount accountWithdraw = bank.findAccount(accNumWithdraw);
                    if (accountWithdraw != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        accountWithdraw.withdraw(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    String accNumBalance = scanner.next();
                    BankAccount accountBalance = bank.findAccount(accNumBalance);
                    if (accountBalance != null) {
                        System.out.println("Balance: ₹" + accountBalance.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter account number: ");
                    String accNumDetails = scanner.next();
                    BankAccount accountDetails = bank.findAccount(accNumDetails);
                    if (accountDetails != null) {
                        accountDetails.displayAccountDetails();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting program. Thank you!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
