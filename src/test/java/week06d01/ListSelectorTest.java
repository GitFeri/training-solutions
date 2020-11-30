package week06d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListSelectorTest {

    @Test
    public void testListSelector() {

        assertThrows(IllegalArgumentException.class, () -> { new ListSelector().secondItem(null);});
        assertEquals("", new ListSelector().secondItem(Arrays.asList()));
        assertEquals("[alma]",new  ListSelector().secondItem(Arrays.asList("alma")));
        assertEquals("[alma,barack]",new  ListSelector().secondItem(Arrays.asList("alma", "körte", "barack", "szilva")));
    }
}

