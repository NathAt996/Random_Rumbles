import java.util.Scanner;

public class Recursion_Practice2 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter a statement");
        String statement = userInput.nextLine();

        System.out.println("How many times do you want to recursively call this?");
        int r = userInput.nextInt();

        Recursion(r, FirstLetterCapital(statement));
    }

    public static void Recursion (int n, String s) {

        if (n == 0) {
            System.out.println("End of recursion");
        }

        else {
            System.out.println(s);
            n--;
            Recursion(n, s);
        }
    }

    public static String FirstLetterCapital (String str) {

        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}