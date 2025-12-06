package Online_Store_Inventory_Manager;

public class Product {

    private String itemName;
    private double price;
    private boolean inStock;

    public Product (String itemName, double price, boolean inStock) {
        this.itemName = itemName;
        this.price = price;
        this.inStock = inStock;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public boolean getInStock() {
        return inStock;
    }

    @Override
    public String toString() {
        return getItemName() + " at £" + getPrice() + " " + getInStock();

    }
}
