import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            //LEADING SPACES
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            //STARS AND SPACES INSIDE
            for (int j = 0; j < 2 * i + 1; j++) {

                //BOUNDARY OR BASE CONDITION
                if (i == n - 1 || j == 0 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
