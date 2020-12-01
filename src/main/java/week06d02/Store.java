package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> products = new ArrayList<>();

    public Store(List<Product> products) {
        this.products = products;
    }

    public int getProductsByCategoryName(Category category) {
        int count = 0;
        for (Product product : products) {
            if (product.getCategory() == category) {
                count++;
            }
        }
        return count;
    }
}
