package week04;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharOperationsTest {

    @Test
    public void testCharOperations() {

        assertEquals(List.of(0,3), new CharOperations().getPositionOfChar("alma","a"));

    }

}
