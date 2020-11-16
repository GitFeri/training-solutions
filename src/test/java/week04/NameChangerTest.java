package week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NameChangerTest {

     @Test
    void testNameCharger1() {
        NameChanger nameChanger = new NameChanger("Kiss Ferenc");
        nameChanger.changeFirstName("Péter");
        assertEquals("Kiss Péter", nameChanger.getFullName());
    }

    @Test
    void testNameCharger2() {
        NameChanger nameChanger = new NameChanger("Valaki Más");
        nameChanger.changeFirstName("Ember");
        assertEquals("Valaki Ember", nameChanger.getFullName());
    }

}
