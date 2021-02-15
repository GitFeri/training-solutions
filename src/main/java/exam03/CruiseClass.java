package exam03;

public enum CruiseClass {
    LUXURY(300_000), FIRST(180_000), SECOND(100_000);

    int cost;

    CruiseClass(int cost) {
        this.cost = cost;
    }
}
