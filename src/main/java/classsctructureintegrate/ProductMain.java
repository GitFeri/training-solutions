package classsctructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        String name;
        int price;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Termék neve : ");
        name = scanner.nextLine();
        System.out.println("Termék ára  : ");
        price = scanner.nextInt();

        Product product = new Product(name,price);
        product.increasePrice(5000);
        product.decreasePrice(4000);
        System.out.println("Termék utolsó ára: " + product.getPrice());

    }
}
