package Continents_Globe;

import java.util.ArrayList;
import java.util.List;

public class Continent_Main {

    public static void main(String[] args) {

        List<Continent> continents = new ArrayList<>();

        continents.add(new Continent("Asia", "Over 4.8 billion as of December 2025", 2300, 51, true));
        continents.add(new Continent("Africa", "Over 1.5 billion as of December 2025", 2000, 54, true));
        continents.add(new Continent("North America", "Over 617 million as of December 2025", 630, 23, true));
        continents.add(new Continent("South America", "Over 430 million as of December 2025", 455, 12, true));
        continents.add(new Continent("Europe", "Over 753 million as of December 2025", 200, 44, true));
        continents.add(new Continent("Oceania", "Over 47 million as of December 2025", 1500, 14, true));
        continents.add(new Continent("Antarctica", "Around 5000 people in the summer and about 1000 max in the winter", 0, 0, true));
        continents.add(new Continent("Arctic", "Around 4 million populate the arctic region", 90, 8, false));


        for(Continent_Interface c : continents) {
            System.out.println("--- CONTINENT ---");
            c.displayDetails();

            System.out.println();

        }
    }
}
