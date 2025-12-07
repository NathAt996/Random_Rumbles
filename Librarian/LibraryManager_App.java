package Librarian;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager_App {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("Don Quixote", "Miguel De Cervantes", true, "01/11/21"));
        books.add(new Book("Crime and Punishment", "Fyodor Dostoyevsky", false, ""));
        books.add(new Book("The Cheese and the Worms: The Cosmos of a Sixteenth Century Miller", "Carlo Ginzburg", true, "04/05/17"));
        books.add(new Book("Guns Germs and Steel", "Jared Diamond", false, ""));
        books.add(new Book("Primitive Rebels", "Eric Hobsbawm", false, ""));
        books.add(new Book("Republic", "Plato", true, "07/12/2025"));

        for (Manageable b : books) {
            System.out.println("--- BOOK ---");
            b.displayDetails();

            if(b.isOverDue()) {
                System.out.println("STATUS: OVERDUE");
            }

            else {
                System.out.println("STATUS: AVAILABLE");
            }

            System.out.println();

        }
    }
}
