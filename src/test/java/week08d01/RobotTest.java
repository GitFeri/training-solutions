package week08d01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RobotTest {
    @Test
    public void testRobot() {

        Position p1 = new Robot().move("FFLLLLLBBBBJJJJJJJ");
        assertEquals(3, p1.getX());
        assertEquals(-3, p1.getY());
    }

    @Test
    public void testRobotEx() {
        assertThrows(IllegalArgumentException.class, () -> new Robot().move("X"));

    }
}
