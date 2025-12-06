package PetShelter;

import java.util.ArrayList;
import java.util.List;

public class Shelter {

    public static void main(String[] args) {

        List<Pet> pets = new ArrayList<>();

        pets.add(new Pet("Buddy", "dog", 4));
        pets.add(new Pet("Rae", "cat", 9));
        pets.add(new Pet("Jim", "bird", 2));

        for(Pet p : pets) {
            System.out.println(p.toString());
        }
    }
}
