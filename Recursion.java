public class Recursion {

    //Simple recursion program to help with my learning

    public static void main(String[] args) {
        Recursor(10);
    }

    public static void Recursor(int n) {
        if (n == 0) {
            System.out.println("Finished");
        }

        else {
            System.out.println("Hello");
            n--;
            Recursor(n);
        }
    }
}
