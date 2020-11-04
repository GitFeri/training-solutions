package week02;

public class Product {
    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product p) {
        return name.equals(p.name);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Asztal", "10");
        Product product2 = new Product("Asztal", "20");
        Product product3 = new Product("Szék", "301");

        System.out.println("1 & 2 termék :" + product1.areTheyEqual(product2));
        System.out.println("1 & 3 termék :" + product1.areTheyEqual(product3));
        System.out.println("2 & 3 termék :" + product2.areTheyEqual(product3));

    }

}
