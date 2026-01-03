import java.util.*;
/*
class Arrays {
    public static void main(String args[]){
        int[] marks=new int[5];
        //int marks[]={98,75,89,45,100}; ANOTHER WAY OR CREATING ARRAY
        marks[0]=98;
        marks[1]=75;
        marks[2]=89;
        marks[3]=45;
        marks[4]=100;

        System.out.println(marks[3]); //ACCESSING ELEMENTS USING INDEX

        for(int i=0;i<5;i++){
            System.out.println(marks[i]); //PRINTING WHOLE ARRAY
        }
    }
}
*/

//TAKING ARRAY AS USER INPUT
/* 
class Arrays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
*/

//Q1.Take an array as user input. Search an element x from that array and return its index (LINEAR SEARCH)
/* 
class Arrays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        int search=sc.nextInt();
        for(int i=0;i<size;i++){
            if(search==arr[i]){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
*/

//2-D ARRAYS
class Arrays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(arr[i][j] + " ");
            }
        }
        sc.close();
    }
}