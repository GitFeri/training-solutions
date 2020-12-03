package week06d04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BudgetTest {
    @Test
    public void testBudget() {

        Budget budget = new Budget(Arrays.asList(
                new Item(10,12,"első"),
                new Item(20,10,"másik"),
                new Item(30,12,"valami")
                ));

        assertEquals(40,budget.getItemsByMonth(12));
        assertEquals(20,budget.getItemsByMonth(10));

    }
}
