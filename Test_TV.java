import java.util.Scanner;

public class Test_TV {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        TV television = new TV ();

        System.out.println("Do you want to keep the TV on? " +
                "\n1 = Yes" +
                "\n2 = No");

        int choice = userInput.nextInt();

        if (choice == 1) {

            television.turnOn();
            System.out.println("\nEnter which channel you want to watch. Eg, 1 = channel 1 etc");

            int selectedChannel = userInput.nextInt();
            television.setChannel(selectedChannel);
            System.out.println("\nYou have selected channel " + television.channel);

            System.out.println("\nEnter volume level (Between 1 - 10");
            int volumeLevel = userInput.nextInt();
            television.setVolume(volumeLevel);
            System.out.println("\nVolume now at " + television.volumeLevel);

        }

        else if (choice == 2) {
            System.out.println("Great! Go read instead");
            television.turnOff();
        }

        else {
            System.out.println("Invalid option. Select Yes (1) or No (2)");

        }

    }
}
