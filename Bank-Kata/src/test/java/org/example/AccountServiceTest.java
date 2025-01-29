package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountServiceTest {

    @Test
    void filterTransactions_should_return_correct_results() {
        TransactionRepository repository = new TransactionRepository(Arrays.asList(
                new Transaction(LocalDate.of(2024, 1, 1), 1000, 1000, TransactionType.DEPOSIT),
                new Transaction(LocalDate.of(2024, 1, 5), -500, 500, TransactionType.WITHDRAWAL),
                new Transaction(LocalDate.of(2024, 1, 10), 2000, 2500, TransactionType.DEPOSIT)
        ));

        FilterCriteria criteria = new FilterCriteria(LocalDate.of(2024, 1, 2), LocalDate.of(2024, 1, 10), null, null, TransactionType.DEPOSIT);
        List<Transaction> filteredTransactions = repository.filterTransactions(criteria);

        assertEquals(1, filteredTransactions.size());
        assertEquals(2000, filteredTransactions.get(0).getAmount());
    }
}
