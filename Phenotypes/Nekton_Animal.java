package Phenotypes;

public class Nekton_Animal extends Animal implements Swimmable {

    public Nekton_Animal(String species) {
        super(species);
    }

    @Override
    public void swim() {
        Swimmable.super.swim();
    }
}
