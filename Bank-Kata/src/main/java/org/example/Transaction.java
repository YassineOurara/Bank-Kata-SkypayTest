package org.example;

import java.time.LocalDate;

public class Transaction {
    private final LocalDate date;
    private final int amount;
    private final TransactionType type; // Remove balance from constructor

    public Transaction(LocalDate date, int amount, TransactionType type) { // Update constructor
        this.date = date;
        this.amount = amount;
        this.type = type; // Assign type
    }

    public LocalDate getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public TransactionType getType() { // Getter for transaction type
        return type;
    }
}
