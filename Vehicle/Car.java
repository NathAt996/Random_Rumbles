package Vehicle;

public class Car {

    String make;
    int year;
    String colour;
    double price;

    Car(String make, int year, String colour, double price) {

        this.make = make;
        this.year = year;
        this.colour = colour;
        this.price = price;
    }

    void accelerate() {
        System.out.println("The " + this.make + " accelerates");
    }

    void decelerate() {
        System.out.println("The " + this.make + " decelerates");
    }

    void breaks () {
        System.out.println("The " + this.make + " breaks");
    }
}
