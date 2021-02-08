package week15d01;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {

    @Test
    void testGetMaxCoodrinate() {
        Map<Double,Double> coordinates = new HashMap<>();
        coordinates.put(12.0,13.0);
        coordinates.put(13.0,11.0);
        coordinates.put(14.0,16.0);
        coordinates.put(15.0,10.0);

        Function function = new Function(coordinates);
        Point point = function.getMaxCoodrinate();

        assertEquals(14.0,point.getX());
        assertEquals(16.0,point.getY());


    }
}