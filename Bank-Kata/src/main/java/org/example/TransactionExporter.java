package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TransactionExporter {

    private static final String CSV_HEADER = "Date,Amount,Balance\n";

    public void exportToCSV(List<Transaction> transactions, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.append(CSV_HEADER);

            int balance = 0; // Initialize balance

            for (Transaction transaction : transactions) {
                balance += transaction.getAmount(); // Compute balance

                writer.append(transaction.getDate().toString())
                        .append(",")
                        .append(String.valueOf(transaction.getAmount()))
                        .append(",")
                        .append(String.valueOf(balance))
                        .append("\n");
            }

            System.out.println("✅ Transactions exported successfully to " + filename);
        } catch (IOException e) {
            System.err.println("❌ Error exporting transactions: " + e.getMessage());
        }
    }
}
