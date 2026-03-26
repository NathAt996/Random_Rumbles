package Single_Class_Programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeGate {

    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        boolean validAge = false;

        while (!validAge) {

            try {
                System.out.println("Please enter your age");
                int age = userInput.nextInt();

                if (age <= 0) {
                    System.out.println("Age cannot be zero or less!");
                }

                else {
                    validAge = true;
                    System.out.println("Age saved " + age);
                }

            } catch (InputMismatchException e) {
                System.out.println("That is not an integer");
                userInput.next();
            } catch (IllegalArgumentException e) {
                System.out.println("Type an integer you buffoon!");
                userInput.next();
            } catch (Exception e) {
                System.out.println("Read the question again, slowly!");
                userInput.next();
            }
        }
    }
}
