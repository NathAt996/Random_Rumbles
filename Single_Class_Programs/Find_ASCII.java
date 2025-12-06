package Single_Class_Programs;

import java.util.Scanner;

public class Find_ASCII {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Get an ASCII from a character");
        System.out.println("\nEnter a character : ");

        String character = userInput.next();

        int convertCharacter = character.charAt(0);

        int userCharacter =  convertCharacter;

        System.out.println("The ASCII code of " + character + " is : " + userCharacter);

    }
}
