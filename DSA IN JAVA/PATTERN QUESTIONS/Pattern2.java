import java.util.Scanner;

/*
*********
 *******
  *****
   ***
    *
*/

public class Pattern2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {

            //SPACES
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            //STARS
            for (int j = 0; j < (2 * rows - (2 * i + 1)); j++) {
                System.out.print("*");
            }

            //NEW LINE
            System.out.println();
        }

        sc.close();
    }
}
