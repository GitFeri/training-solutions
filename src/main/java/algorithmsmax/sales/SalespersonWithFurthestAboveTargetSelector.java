package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {
    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespersons) {
        Salesperson sales = null;
        for (Salesperson person : salespersons) {
            if (sales == null || person.getAmount() - person.getTarget() > sales.getAmount() - sales.getTarget()) {
                sales = person;
            }
        }
        return sales;
    }
}
