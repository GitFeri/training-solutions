package staticattrmeth.bank;

import java.math.BigDecimal;

public class BankTransaction {
    private static long currentMinValue;
    private static long currentMaxValue;

    private static BigDecimal sumOfTrxs;
    private static long numOfTrxs;

    public BankTransaction(long trxValue) {
        if (trxValue < 1 && 10_000_000 < trxValue) {
            throw new IllegalArgumentException("Value is out of range.");
        }

        if (numOfTrxs == 0) {
            currentMinValue = trxValue;
            currentMaxValue = trxValue;
        }

        if (currentMinValue > trxValue) {
            currentMinValue = trxValue;
        }

        if (currentMaxValue < trxValue) {
            currentMaxValue = trxValue;
        }

        sumOfTrxs = sumOfTrxs.add(BigDecimal.valueOf(trxValue));
        numOfTrxs++;
    }

    public static void initTheDay() {
        currentMinValue = 0;
        currentMaxValue = 0;
        sumOfTrxs = new BigDecimal(0);
        numOfTrxs = 0;
    }

    public static BigDecimal averageOfTransaction() {
        return sumOfTrxs.divide(BigDecimal.valueOf(numOfTrxs));
    }

    public static long getCurrentMinValue() {
        return currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return currentMaxValue;
    }

    public static BigDecimal getSumOfTrxs() {
        return sumOfTrxs;

    }

    public long getTrxValue() {
        return sumOfTrxs.longValue();
    }
}
