package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FaktorialisTest {

    @Test
    public void FactorialCalculatorTest() {

        assertEquals(24L,new Faktorialis().getFacrorial (4));
        assertEquals(1L,new Faktorialis().getFacrorial (1));
        assertEquals(3628800L,new Faktorialis().getFacrorial (10));

    }

}
