package org.example;

import java.time.LocalDate;

public class FilterCriteria {
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final Integer minAmount;
    private final Integer maxAmount;
    private final TransactionType transactionType; // ✅ Filter by type

    public FilterCriteria(LocalDate startDate, LocalDate endDate, Integer minAmount, Integer maxAmount, TransactionType transactionType) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.transactionType = transactionType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Integer getMinAmount() {
        return minAmount;
    }

    public Integer getMaxAmount() {
        return maxAmount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }
}
