import java.util.Scanner;

class FindMissingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER N: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];
        boolean[] present = new boolean[n + 1];

        System.out.println("ENTER ARRAY ELEMENTS:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
            present[arr[i]] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.println("MISSING NUMBER IS: " + i);
                break;
            }
        }

        sc.close();
    }
}
