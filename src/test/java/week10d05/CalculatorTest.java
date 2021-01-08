package week10d05;

import org.junit.jupiter.api.Test;
import week10d01.Hiking;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test

    public void testFindMinSumNormal() {
        assertEquals(16, new Calculator().finMinSum(new int[]{1, 3, 5, 7, 9}));
        assertEquals(16, new Calculator().finMinSum(new int[]{7, 7, 20, 9, 1,1}));
    }

    @Test
    public void testFindMinSumExcept() {

        assertThrows(IllegalArgumentException.class, () -> new Calculator().finMinSum(null));
        assertThrows(IllegalArgumentException.class, () -> new Calculator().finMinSum(null));
        assertThrows(IllegalArgumentException.class, () -> new Calculator().finMinSum(new int[]{0,0,0}));
    }
}