package week10d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HikingTest {
    @Test
    public void testGiking(){

        assertEquals(13,new Hiking().getPlusElevation(10,20,15,18));
    }
}
