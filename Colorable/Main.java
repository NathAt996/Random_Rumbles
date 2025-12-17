package Colorable;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        boolean isFinished = false;


        while (!isFinished) {

            System.out.println("\nChoose a shape" +
                    "\nCircle = 1" +
                    "\nSquare = 2" +
                    "\nTriangle = 3" +
                    "\nHit 0 to exit");

            int option = -1;

            try {

                option = userInput.nextInt();

                if (option == 0) {
                    isFinished = true;
                    continue;
                }

                if (option == 1) {

                    System.out.println("You have selected circle.");

                    System.out.println("\nPlease enter a radius");
                    double radii = userInput.nextDouble();

                    Circle circle = new Circle("Circle", radii);
                    circle.howToColor();
                }

                else if (option == 2) {

                    System.out.println("You have selected square");

                    System.out.println("\nPlease enter a length and a width");
                    double length = userInput.nextDouble();
                    double width = userInput.nextDouble();

                    Square square = new Square ("Square", length, width);
                    square.howToColor();
                }

                else if (option == 3) {

                    System.out.println("You have selected a triangle");

                    System.out.println("\nPlease enter a base and a height");
                    double base = userInput.nextDouble();
                    double height = userInput.nextDouble();

                    Triangle triangle = new Triangle("Triangle", base, height);
                    triangle.howToColor();
                }

                else {
                    System.out.println("Invalid option. Please choose 0-3.");
                }


            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer");
                userInput.nextLine();

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Out of bounds. Please enter 1, 2 or 3");
                userInput.nextLine();

            } catch (Exception e) {
                System.out.println("You must enter an integer 1, 2 or 3");
                userInput.nextLine();
            }
        }
    }
}
