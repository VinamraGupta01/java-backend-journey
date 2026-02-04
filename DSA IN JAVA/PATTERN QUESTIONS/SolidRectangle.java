import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int rows=sc.nextInt();
        int cols=sc.nextInt();
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}