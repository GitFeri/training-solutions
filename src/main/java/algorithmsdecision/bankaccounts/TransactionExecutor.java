package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionExecutor {
    public void executeTransactions(List<Transaction> transactions, List<BankAccount> accounts) {
        for(Transaction transaction: transactions) {
            for(BankAccount bankAccount: accounts) {
                if (transaction.getAccountNumber().equals(bankAccount.getAccountNumber())) {
                    if (transaction.isCredit()) {
                        bankAccount.deposit(transaction.getAmount());
                        transaction.setStatus(StatusTypes.SUCCEEDED);
                        transaction.setDateOfTransaction(LocalDateTime.now());
                    } else if (transaction.isDebit()){
                        bankAccount.withdraw(transaction.getAmount());
                        transaction.setStatus(StatusTypes.SUCCEEDED);
                        transaction.setDateOfTransaction(LocalDateTime.now());
                    } else {
                        transaction.setStatus(StatusTypes.PENDING);
                        transaction.setDateOfTransaction(LocalDateTime.now());
                    }
                }
            }
        }
    }
}
