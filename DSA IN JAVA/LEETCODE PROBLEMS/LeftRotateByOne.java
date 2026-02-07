import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        
        int size=5;

        int[] arr={10,20,30,40,50};

        System.out.println("ARRAY BEFORE ROTATING LEFT BY ONE : "+Arrays.toString(arr));

        int temp=arr[0];

        for(int i=1; i<size; i++){
            arr[i-1]=arr[i];
        }
        arr[size-1]=temp;

        System.out.println("ARRAY AFTER ROTATING LEFT BY ONE : "+Arrays.toString(arr));
    }
}