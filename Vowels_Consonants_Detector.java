import java.util.Scanner;

public class Vowels_Consonants_Detector {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter a letter");

        String letter = userInput.next().toLowerCase();

        char inputtedLetter = letter.charAt(0);

        boolean isVowel = (inputtedLetter == 'a' ) || (inputtedLetter == 'e') || (inputtedLetter == 'i')
                || (inputtedLetter == 'o') || (inputtedLetter == 'u');


        //conditionals for letter

        if (isVowel == true) {

            System.out.println(inputtedLetter + " is a vowel");
        }

        else if (isVowel == false) {

            System.out.println(inputtedLetter + " is a consonant");
        }

        else {

            System.out.println(inputtedLetter + " is not a letter");
        }

    }
}
