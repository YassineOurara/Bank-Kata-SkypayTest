package org.example;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {
    private final List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return new ArrayList<>(transactions);
    }

    public List<Transaction> filterTransactions(FilterCriteria criteria) {
        return transactions.stream()
                .filter(transaction -> transaction.getType() == criteria.getTransactionType())
                .toList();
    }

}
