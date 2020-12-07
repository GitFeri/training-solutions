package week07d01;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MathAlgorithmsTest {
    @Test
    public void testMathAlgorithmsTrue() {

        assertTrue(MathAlgorithms.isPrime(13));
        assertTrue(MathAlgorithms.isPrime(29));
        assertTrue(MathAlgorithms.isPrime(53));
    }

    @Test
    public void testMathAlgorithmsFalse() {
        assertFalse(MathAlgorithms.isPrime(63));
        assertFalse(MathAlgorithms.isPrime(64));
        assertFalse(MathAlgorithms.isPrime(111));

    }
}
