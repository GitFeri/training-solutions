package week05d05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.lang.System.err;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    @Test
    void testUser() {

        Exception ex1 = assertThrows(NullPointerException.class, () -> new User("John", "Doe", null));

//        assertTrue(new User("John", "Doe", "email"));

    }
}
