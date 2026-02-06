import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER OF ELEMENTS IN THE ARRAY : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("ARRAY BEFORE REMOVING DUPLICATES : " + Arrays.toString(arr));

        int i = 0;
        for (int j = 1; j < size; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.print("ARRAY AFTER REMOVING DUPLICATES : ");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }

        sc.close();
    }
}
