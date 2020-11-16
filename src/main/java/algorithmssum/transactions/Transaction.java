package algorithmssum.transactions;

import static algorithmssum.transactions.TransactionOperation.CREDIT;
import static algorithmssum.transactions.TransactionOperation.DEBIT;

public class Transaction {
    String accountNumber;
    int amount;
    TransactionOperation transaction;

    public Transaction(String s, TransactionOperation operation, int i) {
        accountNumber = s;
        transaction = operation;
        amount = i;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isCredit() {
        return transaction == CREDIT;
    }

    public boolean isDebit() {
        return transaction == DEBIT;
    }
}
