import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // UPPER HALF
        for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // LOWER HALF
        for (int i = n; i >= 1; i--) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
