package Digital_Library;

public class DVD extends Catalogue_Item {

    private int durationInMinutes;
    private String rating;

    public DVD(String title, String AuthorOrDirector, String uniqueID) {
        super(title, AuthorOrDirector, uniqueID);
    }

    @Override
    public String getMediaType() {
        return "DVD";
    }
}
