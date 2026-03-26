package Phenotypes;

public interface Swimmable {

    default void swim() {
        System.out.println("Swims");
    }
}
