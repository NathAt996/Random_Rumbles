import java.util.Locale;
import java.util.Scanner;

public class Palindrome_Detector {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter a word. Lets test if it is a palindrome!");
        String word = userInput.nextLine();

        int start = 0;
        int end = word.length()-1;
        boolean isPalindrome = true;


        while (start < end) {

            if (word.charAt(start) != word.charAt(end)) {

                isPalindrome = false;
                break;
            }


            else {

                start++;
                end--;
            }
        }


        if (isPalindrome) {

            System.out.println(firstLetterUpper(word) + " is a palindrome");
        }


        else {

            System.out.println(firstLetterUpper(word) + " isn't a palindrome");
        }
    }

    public static String firstLetterUpper (String str) {

        return str.substring(0,1).toUpperCase(Locale.ROOT) + str.substring(1).toLowerCase();
    }
}
