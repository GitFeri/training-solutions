package week15d04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CovidTest {

    @Test
    void testMaxCases() {
        Covid covid = new Covid();
        assertEquals(List.of("2020-48", "2020-49", "2020-46"),
                covid.maxCases(Path.of("files", "week15d04", "data.csv")));
    }

    @Test
    void testFileError() {
        Covid covid = new Covid();
        assertThrows(IllegalStateException.class, ()->
                covid.maxCases(Path.of("files", "week15d04", "dataX.csv")));
    }
}