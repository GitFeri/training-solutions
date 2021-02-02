package week14d02;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class BasketListTest {

    @Test
    void readFile() {
        BasketList bl = new BasketList();
        bl.readFile(Path.of("list.txt"));
//        System.out.println(bl.orderFinder("A233"));
//        System.out.println(bl.getOrderList());
        //bl.makeProductList();
        //    bl.makeProductList();
//        System.out.println(bl.productFinder("rosmary"));
        //      System.out.println(bl.numOfProductByName("A233"));
        System.out.println(bl.getProductList());

    }
}