import java.util.Scanner;

public class LeftRotateByDElements {
    
    public static void leftRotate(int[] arr, int n, int d) {

        d = d % n; 

        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("ENTER ARRAY ELEMENTS:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("ENTER D (number of rotations): ");
        int d = sc.nextInt();

        leftRotate(arr, size, d);

        System.out.println("ARRAY AFTER LEFT ROTATION:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
