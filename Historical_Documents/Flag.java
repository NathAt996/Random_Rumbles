package Historical_Documents;

public class Flag extends HistoricalDocument {

    public Flag(String title, String author, int year) {
        super(title, author, year);
    }

    @Override
    public void Interpret() {
        System.out.println("The " + getTitle() + " created in " + getYear() + " by " + getAuthor() + ". It can be interpreted as the emblem or symbol of a political state or ideology.");
    }
}
