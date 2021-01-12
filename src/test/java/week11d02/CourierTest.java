package week11d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    @Test
    public void testCourier(){

        Courier courier = new Courier();
        courier.addRide(new Ride(1,1,1));
        courier.addRide(new Ride(2,1,1));
        courier.addRide(new Ride(3,1,1));
        courier.addRide(new Ride(5,1,1));
        courier.addRide(new Ride(6,1,1));

        assertEquals(4,courier.getNonWorkDay());

    }

}