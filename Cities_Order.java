import java.util.Scanner;

public class Cities_Order {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a city : ");
        String city1 = userInput.nextLine();
        System.out.println("Now enter another : ");
        String city2 = userInput.nextLine();

        if (city1.compareTo(city2) < 0) {

            System.out.println("The cities in alphabetical order are "
                    + city1 + " " + city2);
        }

        else {

            System.out.println("The cities in alphabetical order are "
                    + city2 + " " + city1);
        }
    }
}
