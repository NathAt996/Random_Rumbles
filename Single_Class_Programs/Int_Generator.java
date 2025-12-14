package Single_Class_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Int_Generator {

    public static void main(String[] args) {

        Random random = new Random(1000);

        int count = 50;

        List<Integer> fiftyNumbers = new ArrayList<>(count);


        for(int i = 0; i < count; i++) {

            int randomNumber = random.nextInt(101);
            fiftyNumbers.add(randomNumber);
        }

        for (int number : fiftyNumbers) {
            System.out.printf("%4d%n", number);
        }
    }
}
