package Single_Class_Programs;

import java.util.Scanner;

public class Recursive_Palindrome {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter a word. Lets test if a palindrome");
        String word = userInput.nextLine();

        System.out.println("Is " + firstLetterCapitalise(word) + " a palindrome? " + isPalindrome(word));

    }

    public static String firstLetterCapitalise (String str) {

        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static boolean isPalindrome (String str) {

        if (str.length() <= 1) {
            return true;
        }

        else if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        else {
            str.substring(1, str.length() - 1);
            return true;
        }
    }
}
