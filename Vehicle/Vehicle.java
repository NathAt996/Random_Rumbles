package Vehicle;

abstract class Vehicle {

    //Data fields

    private String brand;
    private int year;

    //Constructor

    public Vehicle(String brand, int year) {

        this.brand = brand;
        this.year = year;
    }

    //Abstract method

    public abstract void StartEngine();

    public abstract void Accelerate();

    //Getters

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    //Concrete class to display Vehicle.Vehicle methods

    public void displayInfo() {
        System.out.println("Brand:" + brand
        + "\nYear:" + year);
    }
}
