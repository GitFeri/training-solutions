package week14d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class BasketList {
    private Map<String, List<String>> orderList = new HashMap<>();
    private Map<String, Integer> productList = new HashMap<>();

    public Map<String, List<String>> getOrderList() {
        return orderList;
    }

    public Map<String, Integer> getProductList() {
        return productList;
    }

    public void readFile(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(" ");
                String[] items = row[1].split(",");
                orderList.put(row[0], List.of(items));
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("No file", ioe);
        }
        makeProductList();
    }

    public List<String> orderFinder(String term) {
        List<String> result;
        result = new ArrayList<>(orderList.get(term));
        Collections.sort(result);
        return result;
    }


    private void makeProductList() {
        for (String name : orderList.keySet()) {
            for (String product : orderList.get(name)){
             if (productList.containsKey(product)){
                 int value = productList.get(product).intValue();
               value++;
               productList.replace(product,value);
             } else {
               productList.put(product,1);

             }
            }

        }
    }

    public int productFinder(String name) {
        return productList.get(name).intValue();
    }

    public int numOfProductByName(String name){
        return orderList.get(name).size();
    }

}


