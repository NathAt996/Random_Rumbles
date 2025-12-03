public class OOP_Vehicle {

    public static void main(String[] args) {

        Car2 car = new Car2 ("Toyota", 2012);

        car.displayInfo();
        car.getYear();
        car.getBrand();

        System.out.println();

        car.StartEngine();
        car.StartEngine("Drrrrrrrrr");

        System.out.println();

        car.Accelerate();
        car.Accelerate("Vrooom!");
    }
}
