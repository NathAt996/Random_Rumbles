public class Car2 extends Vehicle {

    //Call to superclass constructor

    public Car2(String brand, int year) {
        super(brand, year);
    }

    //Polymorphism method overriding which implements the abstract methods

    @Override
    public void StartEngine() {
        System.out.println("The car starts");
    }

    @Override
    public void Accelerate() {
        System.out.println("The car accelerates");
    }

    //Polymorphism: Method overloading (within the same class)

    public void StartEngine(String sound) {
        System.out.println(sound);
    }

    public void Accelerate(String rev) {
        System.out.println(rev);
    }
}
