package Librarian;

public class Book implements Manageable {

    private String title;
    private String author;
    private boolean checkedOut;
    private String dueDate;

    public Book (String title, String author, boolean checkedOut, String dueDate) {
        this.title = title;
        this.author = author;
        this.checkedOut = checkedOut;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getCheckedOut() {
        return checkedOut;
    }

    public String getDueDate() {
        return dueDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Checked out: " + getCheckedOut());

        if(checkedOut) {
            System.out.println("Due date: " + getDueDate());
        }

    }

    @Override
    public boolean isOverDue() {
        return this.checkedOut;
    }
}
