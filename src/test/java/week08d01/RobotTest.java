package week08d01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotTest {
    @Test
    public void testRobot() {

        Position p1 = new Robot().move("FFLLLLLBBBBJJJJJJJ");
        assertEquals(3,p1.getX());
        assertEquals(-3,p1.getY());

    }
}
