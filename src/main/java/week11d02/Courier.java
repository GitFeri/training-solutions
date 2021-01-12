package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        if (rides.isEmpty()) {
            if (ride.getNumOfRide() == 1) {
                rides.add(ride);
                return;
            }
        } else {
            if (valid(ride)) {
                rides.add(ride);
                return;
            }
        }

        throw new IllegalArgumentException("Invalid input!");
    }

    public int getNonWorkDay() {
        if (rides.get(0).getDayOfRide() > 1) {
            return 1;
        }

        for (int i = 1; i < rides.size(); i++) {
            if ((rides.get(i).getDayOfRide() - rides.get(i - 1).getDayOfRide()) > 1) {
                return rides.get(i - 1).getDayOfRide() + 1;
            }
        }

        return -1;
    }

    private boolean valid(Ride ride) {
        Ride lastRide = rides.get(rides.size() - 1);
        if (lastRide.getDayOfRide() < ride.getDayOfRide() && ride.getNumOfRide() == 1) {
            return true;
        }

        if (lastRide.getDayOfRide() == ride.getDayOfRide() && lastRide.getNumOfRide() + 1 == ride.getNumOfRide()) {
            return true;
        }

        return false;
    }


}