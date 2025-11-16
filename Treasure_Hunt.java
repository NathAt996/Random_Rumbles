import java.util.Random;
import java.util.Scanner;

public class Treasure_Hunt {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        //grid
        int x = random.nextInt(4);
        int y = random.nextInt(4);

        //usersDirections
        int userX = 0;
        int userY = 0;

        System.out.println("Welcome to the treasure hunt\n");

        int attempts = 0;

        while (true) {

            System.out.println("\nEnter north, east, south or west to find the treasure!\n");

            String direction = capitaliseFirst(userInput.nextLine());

            System.out.println("You searched " + direction);

            //replace == with .equals


            if (direction.equals("North")) {

                userY++;
            }

            else if (direction.equals("South")) {

                userY--;
            }

            else if (direction.equals("East")) {

                userX++;
            }

            else if (direction.equals("West")) {

                userX--;
            }

            else {

                System.out.println("Direction invalid");
            }


            if (userX == x && userY == y) {

                System.out.println("Congratulations! You have found the treasure :D");
                break;
            }

            else if (x < userX) {

                System.out.println("The treasure is to the west of your current position");
            }

            else if (x > userX) {

                System.out.println("The treasure is to the east of your current position");
            }

            else if (y < userY) {

                System.out.println("The treasure is to the south of your current position");
            }

            else if (y > userY) {

                System.out.println("The treasure is to the north of your current position");
            }

            attempts++;
        }

        System.out.println("\nAttempt count : " + attempts);

        if (attempts == 1) {

            System.out.println("\nWow! you found the treasure in just " + attempts + " search! You win!");
        }

        else if (attempts > 1 && attempts <= 3) {

            System.out.println("\nYou found the treasure in " + attempts + " searches. You win!");
        }

        else {

            System.out.println("\nBut " + attempts + " searches is too many. You lose :(");
        }
      }

    public static String capitaliseFirst(String str) {

        if (str == null || str.isEmpty()) {

            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
