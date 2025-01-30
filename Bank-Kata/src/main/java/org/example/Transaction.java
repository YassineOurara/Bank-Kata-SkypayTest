package org.example;

import java.time.LocalDate;

public class Transaction {
    private final LocalDate date;
    private final int amount;
    private final TransactionType type;

    public Transaction(LocalDate date, int amount, TransactionType type) {
        this.date = date;
        this.amount = amount;
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }
}
