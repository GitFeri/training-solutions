package week13d02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {
    Airport airport = new Airport();

    @Test
    public void readFileTest() {
        airport.readFiles();
        assertEquals("BH2946", airport.getFlies().get(9).getRegNumber());
    }

    @Test
    public void wichIsMoreTest() {
        airport.readFiles();
        assertEquals("Departures", airport.wichIsMore());
    }


//System.out.println(airport.flies);
    //System.out.println(airport.wichIsMore());
    //System.out.println(airport.searchFlyAtRegNumber("HM0332"));
    //System.out.println(airport.searchFlyAtRegNumber("AB1234"));
    //System.out.println(airport.searchFliesFromToCity("Budapest", "Arrival"));
    //System.out.println(airport.searchEarliestFly());


}