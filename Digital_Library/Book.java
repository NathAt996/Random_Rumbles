package Digital_Library;

public class Book extends Catalogue_Item {

    private String ISBN;

    public Book(String title, String AuthorOrDirector, String uniqueID) {
        super(title, AuthorOrDirector, uniqueID);
    }

    @Override
    public String getMediaType() {
        return "Book";
    }
}
