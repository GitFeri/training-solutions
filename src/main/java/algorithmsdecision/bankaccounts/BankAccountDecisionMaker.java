package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {
    public boolean containsBalanceGreaterThan(List<BankAccount> accounts, int i) {
        for (BankAccount bankAccount : accounts) {
            if (bankAccount.getBalance() > i) {
                return true;
            }

        }
        return false;
    }
}
