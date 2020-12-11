package week07d05;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    @Test
    public void testCar() {

        Vehicle car = new Car();

        assertEquals(TransmissionType.MANUAL, car.getTransmissionType());
        assertEquals(6, car.getNumberOfGears());
    }

    @Test
    public void testTruck() {

        Vehicle truck = new Truck();

        assertEquals(TransmissionType.AUTOMATIC, truck.getTransmissionType());
        assertEquals(8, truck.getNumberOfGears());
    }

    @Test
    public void testMotorcycle () {

        Vehicle motorcycle = new Motorcycle();

        assertEquals(TransmissionType.SEQUENTIAL,motorcycle.getTransmissionType());
        assertEquals(4,motorcycle.getNumberOfGears());
    }
}