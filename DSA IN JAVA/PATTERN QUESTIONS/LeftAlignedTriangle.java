import java.util.Scanner;

public class LeftAlignedTriangle {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int rows=sc.nextInt();

        for(int i=0; i<rows; i++){
            //SPACES
            for(int j=0; j<rows-i-1;  j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}