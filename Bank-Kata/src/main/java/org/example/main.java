package org.example;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        TransactionRepository transactionRepository = new TransactionRepository();
        StatementPrinter statementPrinter = new StatementPrinter();
        Account account = new Account(transactionRepository, statementPrinter);


        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        System.out.println("🔹 All Transactions:");
        account.printStatement();

        FilterCriteria criteria = new FilterCriteria(
                LocalDate.of(2024, 1, 1), // Start Date
                LocalDate.of(2024, 12, 31), // End Date
                null,  // Min Amount
                null,  // Max Amount
                TransactionType.DEPOSIT // Transaction Type
        );

        System.out.println("\n🔹 Filtered Transactions (Deposits Only):");
        account.printFilteredStatement(criteria);
        account.exportTransactions("transactions.csv");


    }
}
