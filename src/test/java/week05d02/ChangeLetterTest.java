package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

        @Test
        void testChangeLetter() {

            assertEquals("*rv*zt*r*t*k*rf*r*g*p", new ChangeLetter().changeVowels("arvizturotukorfurogep"));
            assertEquals("*RV*ZT*R*T*K*RF*R*G*P", new ChangeLetter().changeVowels("ARVIZTUROTUKORFUROGEP"));
        }

}
