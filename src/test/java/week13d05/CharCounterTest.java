package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharCounterTest {

    @Test
    void numOfCharTest() {
        CharCounter charCounter = new CharCounter();
        assertEquals(5,charCounter.numOfChar("akármi"));
        assertEquals(4,charCounter.numOfChar("aA:/%=zUt"));
        assertEquals(0,charCounter.numOfChar(""));
        assertEquals(0,charCounter.numOfChar(""+"+56745673"));

    }
}