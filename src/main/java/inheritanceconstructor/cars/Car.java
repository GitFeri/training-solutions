package inheritanceconstructor.cars;

public class Car {
    private final double fuelRate;
    private final double tankCapacity;
    private double fuel;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (fuel > tankCapacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void drive(int km) {
        if (isEnoughFuel(km)) {
            modifyFuelAmount(-consumption(km));
        } else {
            throw new RuntimeException("Not enough fuel available!");
        }
    }

    public double consumption(int km) {
        return fuelRate / 100 * km;
    }

    public boolean isEnoughFuel(int km) {
        return getFuel() >= consumption(km);
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel += fuel;
    }

    public double calculateRefillAmount() {
        return getTankCapacity() - getFuel();
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getFuel() {
        return fuel;
    }
}
