package week08d03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StringListsTest {
    @Test
    public void testStringListsUnion() {

        assertEquals(List.of("a", "b", "c"),
                StringLists.stringListsUnion(
                        List.of("a", "b"),
                        List.of("a", "c")));

        assertEquals(List.of("a", "b", "c"),
                StringLists.stringListsUnion(
                        List.of("a", "b"),
                        List.of("c", "a")));

        assertEquals(List.of("a", "c", "b"),
                StringLists.stringListsUnion(
                        List.of("a", "c"),
                        List.of("b", "c")));
    }

    @Test
    public void testStringListsUnionDouble() {

        assertEquals(List.of("a", "b", "c"),
                StringLists.stringListsUnion(
                        List.of("a", "b", "b", "a"),
                        List.of("a", "c", "a")));

        assertEquals(List.of("a", "b", "c"),
                StringLists.stringListsUnion(
                        List.of("a", "a", "a", "a"),
                        List.of("b","b","c", "a")));

        assertEquals(List.of("a", "c", "b"),
                StringLists.stringListsUnion(
                        List.of("a", "c", "c", "a"),
                        List.of("b", "c"))
        );
    }
}
