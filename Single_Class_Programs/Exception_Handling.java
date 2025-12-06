package Single_Class_Programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        try {

            System.out.println("Enter name");
            String name = userInput.nextLine();

            System.out.println("\nEnter age");
            int age = userInput.nextInt();

            System.out.println("\nHello " + name);
            System.out.println("\nYou are " + age);

        } catch (InputMismatchException e) {
            System.out.println("You must input text for your name");

        } catch (NumberFormatException e) {
            System.out.println("You must enter an integer for your age");

        } finally {
            userInput.close();
        }

    }
}
