package Phenotypes;

public interface Flyable {

    default void fly() {
        System.out.println("Flap flap flap away!!!");
    }
}
