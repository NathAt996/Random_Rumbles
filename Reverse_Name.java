import java.util.Scanner;

public class Reverse_Name {

        public static void main(String[] args) {

            Scanner userInput = new Scanner(System.in);

            System.out.println("Enter your name");

            String name = userInput.next();

            String reverseName = new StringBuilder(name).reverse().toString();

            //Pass arguments

            String nameCapital = capitaliseFirstLetter(name);
            String reverseCapital = capitaliseFirstLetter(reverseName);

            //Print names

            System.out.println("Hello " + nameCapital + " your name in reverse is " + reverseCapital);
        }


        public static String capitaliseFirstLetter(String str) {

            return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }
    }
