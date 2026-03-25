package Phenotypes;

public class Animal implements Flyable {
    private String species;
    private int wingCount;

    public Animal (String species, int wingCount) {
        this.species = species;
        this.wingCount = wingCount;
    }

    public String getSpecies() {
        return species;
    }

    public int getWingCount() {
        return wingCount;
    }

    @Override
    public void fly() {
        Flyable.super.fly();
    }
}
