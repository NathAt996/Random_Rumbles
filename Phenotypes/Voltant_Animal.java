package Phenotypes;

public class Voltant_Animal extends Animal implements Flyable {
    private int wingCount;

    public Voltant_Animal(String species, int wingCount) {
        super(species);
        this.wingCount = wingCount;
    }

    public int getWingCount() {
        return wingCount;
    }
}
