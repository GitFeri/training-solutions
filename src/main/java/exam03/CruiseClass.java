package exam03;

public enum CruiseClass {
    LUXURY(3.0), FIRST(1.8), SECOND(1.0);

    private static final int cost = 100_000;
    double multiplier;

        CruiseClass(double multiplier) {
        this.multiplier = multiplier;
    }

    public double cost(){
            return multiplier * cost;
    }
}
