import java.util.*;
/* 
class Functions {
    public static int SumofTwo(int x,int y){ //FUNCTION CREATION(WITH ARGUMENTS)
        int add=x+y;
        return add;
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int add=SumofTwo(num1,num2); //FUNCTION CALL
        System.out.println("SUM OF TWO NUMBERS IS :"+add);
    }
}
*/

//PRACTICE QUESTIONS 

//Q1.Print the factorial of a number using user input
/* 
class Functions {
    public static int Fact(int num){
        if(num<0){
            System.out.println("FACTORIAL DOESNT EXISTS");
        }
        int factorial=1;
        for(int i=num;i>=1;i--){
            factorial=factorial*i;
        }
        return factorial;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("FACTORIAL OF " +num+ " IS " +Fact(num));
        sc.close();
    }
}
*/

//Q2.Print the sum of all odd n natural numbers
/* 
class Functions {
    public static int printSum(int n) {
        int sum = 0;
        int odd = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum + odd;
            odd = odd + 2;
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("SUM OF FIRST " + num + " ODD NUMBERS IS " + printSum(num));
        sc.close();
    }
}
*/

//Q3.Write a function that calculates Greatest Common Divisor for 2 numbers
/* 
class Functions {
    public static int gcd(int a,int b) {
        while (b!=0) {
            int remainder=a%b;
            a=b;
            b=remainder;
        }
        return a;
    }
    public static void main(String args[]) {
        int num1=12;
        int num2=18;
        System.out.println("GCD is: " + gcd(num1, num2));
    }
}
*/

//Q4.Print the fibonacci series upto n numbers
class Functions {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("FIBONACCI SERIES : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibonacci(n);
        sc.close();
    }
}
