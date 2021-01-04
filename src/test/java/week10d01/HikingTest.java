package week10d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HikingTest {
    @Test
    public void testGiking(){

        assertEquals(13.0,new Hiking().getPlusElevation( Arrays.asList(10.0,20.0,15.0,18.0)));
        assertEquals(0.0,new Hiking().getPlusElevation(List.of(13.0)));
        assertEquals(2.0,new Hiking().getPlusElevation(List.of(1.0,2.0,3.0,2.0,1.0)));
        assertThrows(IllegalArgumentException.class, ()-> new Hiking().getPlusElevation(null));
    }
}
