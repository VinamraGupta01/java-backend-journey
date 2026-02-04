import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //UPPER HALF
        for (int i = 0; i < n; i++) {

            //UPPER HALF SPACES
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            //UPPER HALF STARS
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //LOWER HALF
        for (int i = n - 2; i >= 0; i--) {

            //LOWER HALF SPACES
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            //LOWER HALF STARS
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
