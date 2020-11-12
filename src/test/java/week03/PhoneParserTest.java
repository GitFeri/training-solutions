package week03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneParserTest {

    @Test
    void testParse () {
        // Given - előkészítés
        PhoneParser parser = new PhoneParser();
        String s = "80-6666666";

        // When - a metódus meghívása
        Phone phone = parser.phoneParse(s);

        // Then

        assertEquals("\"80-6666666\"",phone.toString());
    }

}
