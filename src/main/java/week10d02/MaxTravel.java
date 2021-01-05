package week10d02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxTravel {
    int maxPassangersInPreviousStation;
    int stationNumberWithMaxPassangers;
    int maxPassangersInCurrentStation;

    public int getMaxIndex(List<Integer> stationsNumbers) {

        if (stationsNumbers == null || stationsNumbers.isEmpty()) {
            throw new IllegalArgumentException();
        }

        List<Integer> sortedStationsNumbers = new ArrayList<>(stationsNumbers);
        Collections.sort(sortedStationsNumbers);

        if (sortedStationsNumbers.get(0) < 0) {
            throw new IllegalArgumentException();
        }

        int previousStationNumber = -1;
        for (int stationNumber : sortedStationsNumbers) {
            if (previousStationNumber != stationNumber) {
                newPassengersInStation(stationNumber);
            } else {
                incPassangersInStation(stationNumber);
            }
            previousStationNumber = stationNumber;
        }

        return stationNumberWithMaxPassangers;
    }

    private void incPassangersInStation(int stationNumber) {
        maxPassangersInCurrentStation++;
        if (maxPassangersInPreviousStation <= maxPassangersInCurrentStation) {
            maxPassangersInPreviousStation = maxPassangersInCurrentStation;
            stationNumberWithMaxPassangers = stationNumber;
        }
    }

    private void newPassengersInStation(int stationNumber) {
        maxPassangersInCurrentStation = 0;
        incPassangersInStation(stationNumber);
    }
}
