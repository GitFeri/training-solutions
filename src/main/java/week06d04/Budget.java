package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {
    List<Item> items = new ArrayList<>();

    public Budget(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItemsByMonth(int month) {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getMonth() == month) {
                result.add(item);
            }
        }
        return result;
    }
}

