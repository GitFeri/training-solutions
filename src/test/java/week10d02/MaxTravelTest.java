package week10d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {
    @Test
    public void testGetMaxIndex() {

        assertEquals(12, new MaxTravel().getMaxIndex(List.of(12, 12, 0, 3, 4, 4)));
        assertEquals(10, new MaxTravel().getMaxIndex(List.of(10)));
        assertEquals(10, new MaxTravel().getMaxIndex(List.of(10, 7, 8, 10, 20)));
        assertEquals(10, new MaxTravel().getMaxIndex(List.of(10, 7, 8, 10, 20, 8)));
        assertEquals(10, new MaxTravel().getMaxIndex(List.of(10, 7, 9, 10, 20, 8, 9)));
        assertEquals(20, new MaxTravel().getMaxIndex(List.of(10, 20, 9, 10, 20, 20, 8, 9)));
        assertEquals(0, new MaxTravel().getMaxIndex(List.of(0)));

    }

}