package Enum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_Cafe {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Cafe order = null;
        boolean validChoice = false;

        System.out.println("Welcome to the coffee shop");

        while (!validChoice) {

            System.out.println("\nChoose your order: " +
                    "\nSmall (press 1)" +
                    "\nMedium (press 2)" +
                    "\nLarge (press 3)");

            try {
                int choice = userInput.nextInt();

                if (choice == 1) {
                    order = Cafe.SMALL;
                    validChoice = true;
                }
                else if (choice == 2) {
                    order = Cafe.MEDIUM;
                    validChoice = true;
                }
                else if (choice == 3) {
                    order = Cafe.LARGE;
                    validChoice = true;
                }

                else {
                    System.out.println("Input out of range. Please press 1, 2 or 3.");
                }

            }

            catch (InputMismatchException e) {
                System.out.println("Invalid input type. Please press 1, 2 or 3 (using numbers).");
                userInput.next();
            }
        }

        displayOrder(order);
        userInput.close();
    }

    public static void displayOrder(Cafe coffee) {

        System.out.println("\nOrder received");
        System.out.println("For a " + coffee.getSize() + " coffee the price is £" + coffee.getPrice());
    }
}