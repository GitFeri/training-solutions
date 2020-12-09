package week07d03;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberListTest {
    @Test
    public void testNumberList() {

        assertTrue(NumberList.isIncreasing(Arrays.asList(1, 2, 3)));
        assertTrue(NumberList.isIncreasing(Arrays.asList(1, 2, 3, 3, 3, 3, 4, 5, 20)));
        assertFalse(NumberList.isIncreasing(Arrays.asList(1, 2, 30,15)));
        assertTrue(NumberList.isIncreasing(Arrays.asList(3)));
    }
}

