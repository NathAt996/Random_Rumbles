package Historical_Documents;

public class Treaty extends HistoricalDocument {


    public Treaty(String title, String author, int year) {
        super(title, author, year);
    }

    @Override
    public void Interpret() {
        System.out.println("The " + getTitle() + " created in " + getYear() + " by " + getAuthor() + ". It can be interpreted as establishing peace between two entities.");
    }
}
