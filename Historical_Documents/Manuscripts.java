package Historical_Documents;

public class Manuscripts extends HistoricalDocument {

    public Manuscripts(String title, String author, int year) {
        super(title, author, year);
    }

    @Override
    public void Interpret() {
        System.out.println("The " + getTitle() + " created in " + getYear() + " by " + getAuthor() + ". It can be interpreted as an important first hand document about the time period.");
    }
}
