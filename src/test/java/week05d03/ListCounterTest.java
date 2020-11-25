package week05d03;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListCounterTest {

    @Test
    void testListCounter() {
        assertEquals(0, new ListCounter().startWithA(null));
        assertEquals(0, new ListCounter().startWithA(List.of("")));
        assertEquals(0, new ListCounter().startWithA(List.of("birs")));
        assertEquals(0, new ListCounter().startWithA(List.of("körte","szilva")));
        assertEquals(1, new ListCounter().startWithA(List.of("körte","alma")));
        assertEquals(2, new ListCounter().startWithA(List.of("körte","alma","Alma")));
        assertEquals(2, new ListCounter().startWithA(List.of("körte","alma","Alma")));

    }
}
