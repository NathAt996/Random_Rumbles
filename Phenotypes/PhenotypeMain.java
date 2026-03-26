package Phenotypes;

import java.util.ArrayList;

public class PhenotypeMain {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Voltant_Animal("Bird", 2));
        animals.add(new Nekton_Animal("Otter"));
        animals.add(new Voltant_Animal("Unicorn", 2));
        animals.add(new Animal("Cat"));
        animals.add(new Nekton_Animal("Fish"));

        for (Animal a : animals) {
            System.out.println("Species: " + a.getSpecies());

            if (a instanceof Flyable flyer) {
                flyer.fly();
                System.out.println("But " + a.getSpecies() + " can't swim :-(");
            }

            else if (a instanceof Swimmable swimmable) {
                swimmable.swim();
                System.out.println("But " + a.getSpecies() + " can't fly :-(");
            }

            else {
                System.out.println(a.getSpecies() + " can't swim or fly :-(");
            }
            System.out.println();
        }
    }
}
