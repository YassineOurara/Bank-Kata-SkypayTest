package org.example;



import java.time.LocalDate;
import java.util.List;

public class Account {
    private final TransactionRepository transactionRepository;
    private final StatementPrinter statementPrinter;
    private final TransactionExporter transactionExporter;
    private int balance = 0;

    public Account(TransactionRepository transactionRepository, StatementPrinter statementPrinter) {
        this.transactionRepository = transactionRepository;
        this.statementPrinter = statementPrinter;
        this.transactionExporter = new TransactionExporter(); // Initialize Exporter
    }

    public void exportTransactions(String filename) {
        List<Transaction> transactions = transactionRepository.getTransactions();
        transactionExporter.exportToCSV(transactions, filename);
    }
    public void deposit(int amount) {
        balance += amount;
        transactionRepository.addTransaction(new Transaction(LocalDate.now(), amount, TransactionType.DEPOSIT));
    }

    public void withdraw(int amount) {
        balance -= amount;
        transactionRepository.addTransaction(new Transaction(LocalDate.now(), -amount, TransactionType.WITHDRAWAL));
    }

    public void printStatement() {
        statementPrinter.print(transactionRepository.getTransactions(), balance);
    }

    public void printFilteredStatement(FilterCriteria criteria) {
        statementPrinter.print(transactionRepository.filterTransactions(criteria), balance);
    }
}
