package Digital_Library;

abstract class Catalogue_Item implements Searchable {

    private String title;
    private String AuthorOrDirector;
    private String uniqueID;
    private boolean isBorrowed = false;

    public Catalogue_Item(String title, String AuthorOrDirector, String uniqueID) {
        this.title = title;
        this.AuthorOrDirector = AuthorOrDirector;
        this.uniqueID = uniqueID;
    }

    public void borrowItem() {
        if (!isBorrowed) {
            this.isBorrowed = true;
            System.out.println(title + " has been borrowed.");
        }

        else {
            System.out.println(title + " is already borrowed.");
        }
    }

    @Override
    public boolean matches(String searchTerm) {
        String lowerCaseSearch = searchTerm.toLowerCase();

        return title.toLowerCase().contains(lowerCaseSearch) ||
                AuthorOrDirector.toLowerCase().contains(lowerCaseSearch) ||
                uniqueID.toLowerCase().equals(lowerCaseSearch);
    }

    public abstract String getMediaType();

}
