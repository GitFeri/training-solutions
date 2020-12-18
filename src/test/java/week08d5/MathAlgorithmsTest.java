package week08d5;

import org.junit.jupiter.api.Test;
import week08d05.MathAlgorithms;

import static org.junit.Assert.assertEquals;

public class MathAlgorithmsTest {
    @Test
    public void testMathAlgorithms() {

        assertEquals(2, MathAlgorithms.greatestCommonDivisor(6, 8));
        assertEquals(1, MathAlgorithms.greatestCommonDivisor(6, 7));
        assertEquals(6, MathAlgorithms.greatestCommonDivisor(6, 12));

    }
}
