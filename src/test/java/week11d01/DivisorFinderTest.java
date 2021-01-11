package week11d01;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class DivisorFinderTest {
    @Test
    public void testDivisorFinder() {


        assertEquals(1, DivisorFinder.findDivisors(425));
        assertEquals(2, DivisorFinder.findDivisors(420));
        assertEquals(2, DivisorFinder.findDivisors(42050));
        assertEquals(3, DivisorFinder.findDivisors(42500));
    }
}