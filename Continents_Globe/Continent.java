package Continents_Globe;

public class Continent implements Continent_Interface {

    private String name;
    private String populationSize;
    private long numberOfLanguages;
    private int numberOfCountries;
    private boolean isContinent;

    public Continent(String name, String populationSize, long numberOfLanguages, int numberOfCountries, boolean isContinent) {
        this.name = name;
        this.populationSize = populationSize;
        this.numberOfLanguages = numberOfLanguages;
        this.numberOfCountries = numberOfCountries;
        this.isContinent = isContinent;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name of continent: " + name);
        System.out.println("Population size of " + name + ": " + populationSize);
        System.out.println("Number of languages in " + name + ": " + numberOfLanguages);
        System.out.println("Number of countries in " + name + ": " + numberOfCountries);
        System.out.println("Is " + name + " still officially recognised as a continent by the UN? " + isContinent);
    }

    @Override
    public String populationSize() {
        return populationSize;
    }

    @Override
    public long numberOfLanguages() {
        return numberOfLanguages;
    }

    @Override
    public int numberOfCountries() {
        return numberOfCountries;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public boolean isContinent() {
        if(isContinent == false) {
            System.out.println("is not recognised as a continent");
        }
        return false;
    }
}
