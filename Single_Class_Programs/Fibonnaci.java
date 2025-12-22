package Single_Class_Programs;

import java.util.Scanner;

public class Fibonnaci {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter an integer for the relevant index in the Fibonnaci sequence");
        long index = userInput.nextLong();

        System.out.println("\nThe fibonnaci number at index " + index + " is " + fibonnaci(index));
    }

    public static long fibonnaci (long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
           return fibonnaci(n - 1) + fibonnaci(n - 2);
        }
    }
}
