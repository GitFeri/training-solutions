package week06d02;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void testProduct() {
        Store store = new Store(Arrays.asList(
                new Product("Hús", Category.FROZEN, 20),
                new Product("Hal", Category.FROZEN, 20),
                new Product("Borsó", Category.FROZEN, 20),
                new Product("Csoki", Category.OTHER, 20)
        ));

        assertEquals(3, store.getProductsByCategoryName(Category.FROZEN));
        assertEquals(1, store.getProductsByCategoryName(Category.OTHER));
    }
}

