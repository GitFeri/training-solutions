package week14d05;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HachikoTest {

    @Test
    void testCountWords() {

        Hachiko hachiko = new Hachiko();
        Map<String,Integer> hc = hachiko.countWords("hachiko.srt",
                "Hachiko", "haza","pályaudvar", "jó","akármimás");

        assertEquals(4,hc.get("Hachiko"));
        assertEquals(15,hc.get("haza"));
        assertEquals(5,hc.get("pályaudvar"));
        assertEquals(15,hc.get("jó"));
        assertEquals(0,hc.get("akármimás"));
    }
}