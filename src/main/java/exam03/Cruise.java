package exam03;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.Callable;

public class Cruise {
    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers;

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
        this.passengers = new ArrayList<>();
    }

    public void bookPassenger(Passenger passenger) {
        if (passengers.size() == 5) {
            throw new IllegalArgumentException("Too many books");

        } else {
            passengers.add(passenger);
        }
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public double getPriceForPassenger(Passenger passenger) {
        return passenger.getCruiseClass().cost();
    }

    public Passenger findPassengerByName(String name) {
        for (Passenger passenger : passengers) {
            if (name.equals(passenger.getName())) {
                return passenger;
            }
        }
        return null;
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> nameOfPassengers = new ArrayList<>();
        for (Passenger passenger : passengers) {
            nameOfPassengers.add(passenger.getName());
        }
        Collections.sort(nameOfPassengers);
        return nameOfPassengers;
    }

    public double sumAllBookingsCharged() {
        Map<CruiseClass, Integer> result = countPassengerByClass();
        return 0.0;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> result = new HashMap<>();

        for (Passenger passenger : passengers) {
            if (result.containsKey(passenger.getCruiseClass())) {
                int value = result.get(passenger.getCruiseClass()).intValue();
                value++;
                result.replace((passenger.getCruiseClass()), value);
            } else {
                result.put(passenger.getCruiseClass(), 1);
            }
        }
        return result;

    }
}


