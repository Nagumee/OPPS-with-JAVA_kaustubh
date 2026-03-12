
import java.io.*;

public class TransactionLogger {
    private static final String FILE_NAME = "transactions.txt";

    public void logTransaction(int accountNumber, String type, double amount) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(accountNumber + " | " + type + " | " + amount);
            bw.newLine();
            System.out.println("Transaction logged successfully!");
        } catch (IOException e) {
            System.out.println("Error logging transaction: " + e.getMessage());
        }
    }
}