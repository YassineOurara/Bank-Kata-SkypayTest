package org.example;

import java.util.List;

public class StatementPrinter {

    public void print(List<Transaction> transactions, int initialBalance) {
        System.out.println("Date       || Amount || Balance");

        int currentBalance = initialBalance;

        for (Transaction transaction : transactions) {
            currentBalance += transaction.getAmount();
            System.out.printf("%s || %d || %d%n", transaction.getDate(), transaction.getAmount(), currentBalance);
        }
    }
}
