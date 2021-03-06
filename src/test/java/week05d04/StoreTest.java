package week05d04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreTest {
    @Test
    void testStore() {
        Store store = new Store(new ArrayList<>(Arrays.asList(
                new Product("alma", 2020, 11, 30),
                new Product("körte", 2020, 11, 10),
                new Product("barack", 2020, 11, 12)
        )));

        assertFalse(store.addProduct(new Product("alma", 2020, 11, 30)));
        assertTrue(store.addProduct(new Product("birsalma", 2021, 12, 31)));
        assertFalse(store.addProduct(new Product("Szilva", 2020, 11, 20)));


    }
}
