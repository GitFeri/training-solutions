package initalizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreditCard {

    private static final List<Rate> RATES = new ArrayList<>();
    private long balance;

    public CreditCard(long balance) {
        this.balance += balance;
    }

    public CreditCard(long balance, Currency currency) {
        this.balance += Math.round(balance * getConversionFactor(currency));
    }

    public CreditCard(long balance, Currency currency, List<Rate> rates) {
        RATES.addAll(rates);
        this.balance += Math.round(balance * getConversionFactor(currency));
    }

    public long getBalance() {
        return balance;
    }

    public boolean payment(long amount, Currency currency) {
        return payment(Math.round(amount * getConversionFactor(currency)));
    }

    public boolean payment(long amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    private double getConversionFactor(Currency currency) {
        for (Rate rate : RATES) {
            if (rate.getCurrency() == currency) {
                return rate.getConversionFactor();
            }
        }
        return 1.0;
    }
}
