package week14d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class IndexerTest {

    @Test
    void Testindex() {


        Indexer indexer = new Indexer();
        List<String> names = List.of("Odon", "Lujza", "Abraham", "Magdolna", "Lajos");

        assertEquals(
                Map.of(
                        'A', Arrays.asList("Abraham"),
                        'L', Arrays.asList("Lujza", "Lajos"),
                        'M', Arrays.asList("Magdolna"),
                        'O', Arrays.asList("Odon")),
                indexer.index(names));


    }
}