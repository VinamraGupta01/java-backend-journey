import java.util.*;
/* 
class Recursion {
    public static void printNumbers(int n){
        if(n==0){ //BASE CASE
            return;
        }
        System.out.println(n);
        printNumbers(n-1); //RECURSIVE CASE
    }
    public static void main(String args[]){
        int n=5;
        printNumbers(n);
    }
}
*/

//PRACTICE QUESTIONS FOR RECURSION

//Q1.Print the sum of first n natural no.s using recursion
/* 
class Recursion {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(sum(n));
    }
}
*/

//Q2.Print factorial of a number n using recursion
/* 
class Recursion {
    public static int printFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*printFactorial(n-1);
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(printFactorial(n));
    }
}
*/

//Q3.Print fibonacci series upto Nth terms using recursion
/* 
class Recursion {
    public static void printFibonacci(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFibonacci(b,c,n-1);
    }
    public static void main(String args[]){
        int n=7;
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        printFibonacci(a,b,n-2);
    }
}
*/

//INTERMEDIATE QUESTIONS FOR RECURSION

//Q1.Tower or hanoi
/* 
class Recursion {
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("TRANSER DISK "+n+" FROM "+src+" TO "+dest);
            return;
        }
        towerOfHanoi(n-1,src,helper,dest);
        System.out.println("TRANSFER DISK "+n+" FROM "+src+" TO "+dest);
        towerOfHanoi(n-1,helper,src,dest);
    }
    public static void main(String args[]){
        int n=3;
        towerOfHanoi(n,"SOURCE","HELPER","DESTINATION");
    }   
}
*/

//Q2.Reverse a string using recursion
/* 
class Recursion {
    public static void printRev(String name,int idx){
        if(idx==0){
            System.out.println(name.charAt(idx));
            return;
        }
        System.out.println(name.charAt(idx));
        printRev(name,idx-1);
    }
    public static void main(String args[]){
        String name="Vinamra";
        printRev(name,name.length()-1);
    }
}
*/

//Q3.Check if an array is sorted (strictly increasing)
/* 
class Recursion {
    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return isSorted(arr,idx+1);
        }
        else{
            return false;
        }
    }
        public static void main(String args[]){
            int arr[]={1,2,3,4,5};
            System.out.println(isSorted(arr,0));
    }
}
*/

//Q4.Remove duplicates from a string
/*
class Recursion {
    // To track whether a character has already appeared
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newStr) {
        // BASE CASE
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        // If character already exists
        if (map[currChar - 'a']) {
            removeDuplicates(str, idx + 1, newStr);
        } 
        // If character does NOT exist
        else {
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr);
        }
    }

    public static void main(String args[]) {
        String str = "accbccddaa";
        removeDuplicates(str, 0, "");
    }
}
*/

//Q5.Print all the subsequences of a string
class Recursion {
    public static void printSubsequences(String str, int idx, String curr) {
        if (idx == str.length()) {
            System.out.println(curr);
            return;
        }
        char ch = str.charAt(idx);
        printSubsequences(str, idx + 1, curr + ch);
        printSubsequences(str, idx + 1, curr);
    }
    public static void main(String args[]) {
        String str = "abc";
        printSubsequences(str, 0, "");
    }
}
