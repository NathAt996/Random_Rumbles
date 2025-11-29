public class Car_Main {

    public static void main(String[] args) {

        Car myCar = new Car("Toyota", 2019, "Red", 53000);
        Car myCar2 = new Car("Ford Fiesta", 1999, "Blue", 36789);

        myCar.accelerate();
        myCar2.decelerate();
        myCar.breaks();
    }
}
