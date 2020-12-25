package week09d02;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FibcalculatorTest {

    @Test
    public void testFibCalculator() {
        assertEquals(10,new FibCalculator().sumEvens(10));
        assertEquals(188,new FibCalculator().sumEvens(144));
    }
}
