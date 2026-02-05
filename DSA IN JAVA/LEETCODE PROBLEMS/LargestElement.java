import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER NUMBER OF ELEMENTS IN ARRAY : ");
        int size=sc.nextInt();
        
        int[] arr=new int[size];

        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0; i<size; i++){
            if(arr[i] > largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i] > secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }

        System.out.println("DEFINED ARRAY IS : "+Arrays.toString(arr));
        System.out.println("LARGEST ELEMENT IN THE ARRAY IS : "+largest);
        System.out.println("SECOND LARGEST ELEMENT IN THE ARRAY IS : "+secondLargest);


        sc.close();
    }
}