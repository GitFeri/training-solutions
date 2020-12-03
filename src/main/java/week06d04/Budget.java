package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {
    List<Item> items = new ArrayList<>();

    public Budget(List<Item> items) {
        this.items = items;
    }

    public int getItemsByMonth(int month) {
        int sum = 0;
        for (Item item : items) {
            if (item.getMonth() == month) {
                sum += item.getPrice();
            }
        }
        return sum;
    }
}

