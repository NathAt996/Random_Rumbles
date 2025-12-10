package Enum;

public enum Cafe {

    SMALL("Small", 3.05),
    MEDIUM("Medium", 4.15),
    LARGE("Large", 6.00);

    final private String size;
    final private double price;

    Cafe(String size, double price) {
        this.size = size;
        this.price = price;
    }

    public String getSize() {
        return this.size;
    }

    public double getPrice() {
        return this.price;
    }
}
