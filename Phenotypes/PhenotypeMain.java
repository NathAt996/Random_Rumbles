package Phenotypes;

import java.util.ArrayList;

public class PhenotypeMain {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Bird", 2));
        animals.add(new Animal("Fish", 0));
        animals.add(new Animal("Unicorn", 2));
        animals.add(new Animal("Otter", 0));

        for(Animal a : animals) {
            System.out.println("Species: " + a.getSpecies());
            System.out.println("Wing count: " + a.getWingCount());

            if(a.getWingCount() <= 0) {
                System.out.println(a.getSpecies() + " can't fly :-(");
                System.out.println();
            }

            else {
                a.fly();
                System.out.println();
            }
        }
    }
}
