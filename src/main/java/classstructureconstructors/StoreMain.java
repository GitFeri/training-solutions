package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store store1 = new Store("alma");
        Store store2 = new Store("körte");

        store1.store(10);
        store2.store(20);

        store1.dispatch(5);
        store2.dispatch(9);

        System.out.println("Első termék    : " + store1.getProduct() + " " + store1.getStock() + " db");
        System.out.println("Második termék : " + store2.getProduct() + " " + store2.getStock() + " db");

    }
}
