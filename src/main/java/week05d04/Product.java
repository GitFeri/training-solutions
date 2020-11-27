package week05d04;

import java.time.LocalDate;

public class Product {
    private String name;
    private LocalDate localDate;

    public Product(String name, int year, int month, int day) {
        this.name = name;
        localDate = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }


}
