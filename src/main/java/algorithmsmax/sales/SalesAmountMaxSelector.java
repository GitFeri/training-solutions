package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxSelector {
    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespersons) {
        Salesperson sales = null;
        for (Salesperson person : salespersons) {
          if (sales == null || person.getAmount() > sales.getAmount()) {
              sales = person;
          }
        }
        return sales;
    }
}
