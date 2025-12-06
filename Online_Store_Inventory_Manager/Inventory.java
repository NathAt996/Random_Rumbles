package Online_Store_Inventory_Manager;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 99.99, true));
        products.add(new Product("Headphones", 18.54, false));
        products.add(new Product("iPhone X", 323.67, true));
        products.add(new Product("Wireless keyboard", 72.39, true));
        products.add(new Product("Xbox 540", 599.99, false));

        System.out.println("----- Online Store -----");
        System.out.println();

        for(Product p : products) {
            System.out.println(p.toString());
        }
    }
}
