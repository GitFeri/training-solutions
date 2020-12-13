package inheritanceconstructor.cars;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    @Override
    public double getFuel() {
        return super.getFuel() + getExtraFuel();
    }

    @Override
    public double getTankCapacity() {
        return super.getTankCapacity() + getExtraCapacity();
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        extraFuel += fuel;
        if (extraFuel < 0) {
            super.modifyFuelAmount(extraFuel);
            extraFuel = 0.0;
        }
    }
}
