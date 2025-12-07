package Digital_Library;

import java.util.ArrayList;
import java.util.List;

public class Digital_Library_Main {

    public static void main(String[] args) {

        List<Catalogue_Item> libraryCatalogue = new ArrayList<>();

        libraryCatalogue.add(new Book("Jesse James: The Last Rebel of The Civil War", "T.J. Stiles", "CW5-2002"));
        libraryCatalogue.add(new DVD("Inception", "Christopher Nolan", "L205"));

        for (Catalogue_Item item : libraryCatalogue) {
            System.out.println("--- Item Details ---");
            System.out.println("Type: " + item.getMediaType());
            item.borrowItem();

            System.out.println("Does it match 'inception'? " + item.matches("inception"));
            System.out.println("Does it match 'Stiles'? " + item.matches("Stiles"));

            System.out.println();
        }
    }
}