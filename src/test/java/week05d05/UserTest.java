package week05d05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class UserTest {
    @Test
    void testUser() {
        assertThrows(NullPointerException.class, () -> { new User("John", "Doe", null);});
        assertThrows(IllegalStateException.class, () -> { new User("John", "Doe", "email");});
        assertThrows(IllegalStateException.class, () -> { new User("John", "Doe", "email@.com");});
        assertThrows(IllegalStateException.class, () -> { new User("John", "Doe", "email.com");});
        assertThrows(IllegalStateException.class, () -> { new User("John", "Doe", "email@xcom.");});
        assertEquals("John Doe",new User("John","Doe", "user@domain.com").getFullName());
    }
}


