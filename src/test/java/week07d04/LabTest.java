package week07d04;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class LabTest {


    @Test
    public void testLabFalse() {
        Lab lab = new Lab("First Course");

        assertEquals("First Course", lab.getTitle());
        assertFalse(lab.isCompleted());

    }

    @Test
    public void testLabTrue() {
        Lab lab = new Lab("Second Course",
                LocalDate.of(2020, 10, 10));

        assertEquals("Second Course", lab.getTitle());
        assertEquals(LocalDate.of(2020, 10, 10), lab.getCompletedAt());
        assertTrue(lab.isCompleted());
    }

    @Test
    public void testLabueNow() {
        Lab lab = new Lab("Second Course",
                LocalDate.now());

        assertEquals("Second Course", lab.getTitle());
        assertEquals(LocalDate.now(), lab.getCompletedAt());
        assertTrue(lab.isCompleted());
    }
}
