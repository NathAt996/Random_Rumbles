import java.util.Scanner;

public class Chinese_Zodiac {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("The Chinese Zodiac is based on a twelve year cycle");
        System.out.println("\nEnter a year to see which animal it is");

        int year = userInput.nextInt();

        switch (year % 12) {

            case 0:
                System.out.println(year + " Year of the Monkey");
                break;


            case 1:
                System.out.println(year + " Year of the Rooster");
                break;


            case 2:
                System.out.println(year + " Year of the Dog");
                break;


            case 3:
                System.out.println(year + " Year of the Pig");
                break;


            case 4:
                System.out.println(year + " Year of the Rat");
                break;


            case 5:
                System.out.println(year + " Year of the Ox");
                break;


            case 6:
                System.out.println(year + " Year of the Tiger");
                break;


            case 7:
                System.out.println(year + " Year of the Rabbit");
                break;


            case 8:
                System.out.println(year + " Year of the Dragon");
                break;


            case 9:
                System.out.println(year + " Year of the Snake");
                break;


            case 10:
                System.out.println(year + " Year of the Horse");
                break;


            case 11:
                System.out.println(year + " Year of the Sheep");
        }
    }
}
