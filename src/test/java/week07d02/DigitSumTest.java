package week07d02;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitSumTest {
    @Test
    public void testDigitSum (){
        assertEquals(6,DigitSum.sumOfDigits(123));
        assertEquals(21,DigitSum.sumOfDigits(123456));
    }

    @Test
    public void testDigitSumOther () {
        assertEquals(6,DigitSum.sumOfDigitsOther(123));
        assertEquals(21,DigitSum.sumOfDigitsOther(123456));

    }

    @Test
    public void testDigitSumMath () {
        assertEquals(6,DigitSum.sumOfDigitsMath(123));
        assertEquals(21,DigitSum.sumOfDigitsMath(123456));

    }
}
