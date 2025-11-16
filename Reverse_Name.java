import java.util.Scanner;

public class Reverse_Name {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter your first name");

        String firstName = userInput.next();

        System.out.println("Enter your last name");

        String lastName = userInput.next();

        //reverse first name

        String reverseName1 = new StringBuilder(firstName).reverse().toString();
        String reverseName2 = new StringBuilder(lastName).reverse().toString();

        //pass arguments for capital letter

        String capitalFirstName = firstLetterCapitalise(firstName);
        String capitalLastName = firstLetterCapitalise(lastName);
        String capitalReverseName = firstLetterCapitalise(reverseName1);
        String capitalReverseName2 = firstLetterCapitalise(reverseName2);

        //print

        System.out.println("Hello " + capitalFirstName + " " + capitalLastName +
                " or shall I say " + capitalReverseName + " " + capitalReverseName2
                + " ahahaha!!!");
    }


    public static String firstLetterCapitalise (String str) {

        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
