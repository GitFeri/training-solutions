package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionDecisionMaker {

    public boolean containsCreditEntryGreaterThan(List<Transaction> transactions, LocalDateTime startTime, LocalDateTime endTime, int i) {
        for (Transaction transaction : transactions) {
            if (transaction.getDateOfTransaction().isAfter(startTime) &&
                    transaction.getDateOfTransaction().isBefore(endTime) &&
                    transaction.getAmount() > i &&
                    transaction.isDebit()) {
                return true;
            }
        }
        return false;
    }
}
