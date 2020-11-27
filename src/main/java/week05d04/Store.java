package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    private List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public boolean addProduct(Product product) {
        if (product.getLocalDate().isBefore(LocalDate.now())) {
            return false;
        }

        for (Product oneProduct : products) {
            if (oneProduct.getName().equals(product.getName())) {
                return false;
            }
        }
        products.add(product);
        return true;
    }

    public int getNumberOfExpired() {
        int count = 0;
        for (Product product : products) {
            if (!product.getLocalDate().isBefore(LocalDate.now())) {
                count++;
            }
        }
        return count;
    }


}
