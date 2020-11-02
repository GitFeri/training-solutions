package statements;

public class Investment {
    private double cost;
    private int fund, interestRate;
    private boolean active = true;

    public Investment(int fund, int interestRate) {
        this.cost = cost;
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        return (double) interestRate * fund * days / 36500;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public double close(int days) {
        double yield = getYield(days);
        cost = 0.003 * (fund + yield);
        double payment = active ? fund + yield - cost : 0.0;
        active = false;
        return payment;
    }

}
