package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {
    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespersons) {
        Salesperson sales = null;
        for (Salesperson person : salespersons) {
            if (sales == null || person.getTarget() - person.getAmount() > sales.getTarget() - sales.getAmount()) {
                sales = person;
            }
        }
        return sales;

    }
}
