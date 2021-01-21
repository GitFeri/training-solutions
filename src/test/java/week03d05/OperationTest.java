package week03d05;

import org.junit.jupiter.api.Test;
import week03d05.Operation;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationTest {
    @Test
    void testOperation () {
        assertEquals(30,new Operation("10+20").GetResult());
        assertEquals(30,new Operation(" 10 + 20 ").GetResult());
    }
}
