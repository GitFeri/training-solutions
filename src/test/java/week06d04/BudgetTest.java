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

        assertEquals(2,budget.getItemsByMonth(12).size());
        assertEquals(1,budget.getItemsByMonth(10).size());
        assertEquals("másik",budget.getItemsByMonth(10).get(0).getName());
        assertEquals("valami",budget.getItemsByMonth(12).get(1).getName());

    }
}
