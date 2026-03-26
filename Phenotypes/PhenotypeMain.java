package Phenotypes;

import java.util.ArrayList;

public class PhenotypeMain {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Voltant_Animal("Bird", 2));
        animals.add(new Animal("Otter"));
        animals.add(new Voltant_Animal("Unicorn", 2));

        for (Animal a : animals) {
            System.out.println("Species: " + a.getSpecies());

            if (a instanceof Flyable flyer) {
                flyer.fly();
            }

            else {
                System.out.println(a.getSpecies() + " can't fly :-(");
            }
            System.out.println();
        }
    }
}
