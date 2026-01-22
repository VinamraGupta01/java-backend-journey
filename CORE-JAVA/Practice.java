//PRACTICE QUESTIONS FROM BASIC TO ADVANCE

import java.util.*;
//Q1.Print the sum of n natural numbers 
/* 
class Practice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        sc.close();
    }
}
*/

//Q2.Print table of a number using user input
/* 
class Practice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<=num;i++){
            System.out.println(num+ "x" +i+ "=" +num*i);
        }
        sc.close();
    }
}
*/

//Q3.Print the pattern-:
    //*****
    //*****
    //*****
/* 
class Practice {
    public static void main(String args[]){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

//Q4.Print the pattern-:
     //*****
     //*   *
     //*   *
     //*****
/* 
class Practice {
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
*/

//Q5.Print the following pattern-:
     //*
     //**
     //***
     //****
     //*****
/* 
class Practice {
    public static void main(String args[]){
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

//Q6.Print the following pattern
     //*****
     //****
     //***
     //**
     //*
/* 
class Practice {
        public static void main(String args[]){
            int rows=4;
            for(int i=rows;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
     }
*/

//Q7.Print the following pattern
        //*
       //**
      //***
     //****
/* 
class Practice {
    public static void main(String args[]){
        int rows=4;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

//Q8.Print the following pattern
     //1
     //12
     //123
     //1234
     //12345
/* 
class Practice {
    public static void main(String args[]){
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
*/

// ADVANCE LEVEL PATTERN QUESTIONS

//Q1.Print the buterfly pattern
     //*      *
     //**    **
     //***  ***
     //******** 
     //******** 
     //***  ***
     //**    **
     //*      *
/* 
class Practice {
    public static void main(String args[]) {
        int rows = 5;
        // UPPER HALF
        for (int i = 1; i <= rows; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // LOWER HALF
        for (int i = rows; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

//Q2.Print solid rhombus
        //*****
       //*****
      //*****
     //***** 
/* 
class Practice {
    public static void main(String args[]){
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=rows;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

//Q3.Print number pyramid
        //1
       //2 2
      //3 4 3
     //4 4 4 4
    //5 5 5 5 5
class Practice {
    public static void main(String args[]){
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}