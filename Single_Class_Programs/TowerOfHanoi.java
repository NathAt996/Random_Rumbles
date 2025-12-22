package Single_Class_Programs;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter the number of disks");
        int n = userInput.nextInt();

        System.out.println("The moves are: ");
        moveDisks(n, 'A', 'B', 'C');

    }

    public static void moveDisks (int n, char fromTower, char toTower, char auxTower) {

        if (n == 1) {
            System.out.println("Move disk " + n + " from tower " + fromTower + " to tower " + toTower);
        } else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from tower " + fromTower + " to tower " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }
}
