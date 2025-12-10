package Enum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_Cafe {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Cafe order;
        double totalCost = 0.00d;
        boolean finishedOrder = false;

        System.out.println("Welcome to the coffee shop");

        while (!finishedOrder) {

            boolean validChoice = false;


            while (!validChoice) {

                System.out.println("\nChoose your order: " +
                        "\nSmall (press 1)" +
                        "\nMedium (press 2)" +
                        "\nLarge (press 3)" +
                        "\nTo pay (press 0)");

                try {

                    int choice = userInput.nextInt();

                    if (choice == 0) {
                        finishedOrder = true;
                        validChoice = true;
                        continue;
                    }

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
                        continue;
                    }

                    totalCost += order.getPrice();
                    System.out.println(order.getSize() + " coffee added to your order");
                    System.out.printf("Current total: £%.2f\n", totalCost);


                } catch (InputMismatchException e) {
                    System.out.println("Invalid input type. Please press 1, 2 or 3 (using numbers).");
                    userInput.next();
                }
            }
        }

        if (finishedOrder) {
            System.out.printf("\nTotal Cost: £%.2f\n", totalCost);
            System.out.println("\nHave a great day!");
            userInput.close();
        }
    }
}