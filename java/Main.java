import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransactionLogger logger = new TransactionLogger();
        BankAccount account = new BankAccount(101, "Alice", 1000.0);

        while (true) {
            System.out.println("\n--- Bank Transaction System ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    logger.logTransaction(account.getAccountNumber(), "Deposit", depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                        logger.logTransaction(account.getAccountNumber(), "Withdraw", withdrawAmount);
                    } catch (InsufficientBalanceException e) {
                        System.out.println("Transaction failed: " + e.getMessage());
                    } catch (ArithmeticException e) {
                        System.out.println("Invalid withdrawal: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}
