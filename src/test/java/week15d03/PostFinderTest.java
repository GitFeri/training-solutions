package week15d03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostFinderTest {
    PostFinder postFinder;

    @BeforeEach
    void setUp() {
        postFinder = new PostFinder(Arrays.asList(
                new Post("cím1", LocalDate.of(2020, 01, 01), "tartalom1", "tulaj1"),
                new Post("cím2", LocalDate.of(2020, 01, 02), "tartalom1", "tulaj1"),
                new Post("cím3", LocalDate.of(2022, 01, 02), "tartalom1", "tulaj1"),
                new Post("cím4", LocalDate.of(2020, 01, 03), "tartalom1", "tulaj1"),
                new Post("cím2", LocalDate.of(2020, 01, 04), "tartalom2", "tulaj2")
        ));
    }

    @Test
    void testFindPostsFor() {

        List<Post> result = postFinder.findPostsFor("tulaj1");
        assertEquals(3,result.size());
        assertEquals("cím4",result.get(2).getTitle());

    }

    @Test
    void testEmptyParamer() {
        assertThrows(IllegalArgumentException.class,() ->new PostFinder(Arrays.asList(
                new Post("", LocalDate.of(2020, 01, 01), "tartalom1", ""))));

    }

}