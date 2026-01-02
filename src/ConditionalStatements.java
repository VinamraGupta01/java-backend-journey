import java.util.*;

//IF STATEMENT 
/* 
class ConditionalStatements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>10){
            System.out.println("A IS GREATER THAN 10");
        }
        sc.close();
    }
}
*/

//IF-ELSE STATEMENTS
/* 
class ConditionalStatements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num % 2 == 0){
            System.out.println("EVEN NUMBER");
        }
        else{
            System.out.println("ODD NUMBER");
        }
        sc.close();
    }
}
*/

//IF-ELSE-IF STATEMENTS
/* 
class ConditionalStatements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("GRADE A");
        }
        else if (marks>=80){
            System.out.println("GRADE B");
        }
        else if(marks>=70){
            System.out.println("GRADE C");
        }
        else if(marks>=60){
            System.out.println("GRADE D");
        }
        else if(marks>=50){
            System.out.println("GRADE E");
        }
        else{
            System.out.println("GRADE F");
        }
        sc.close();
    }
}
*/

class ConditionalStatements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch(day){
            case 1 : 
            System.out.println("MONDAY");
            break;
            case 2 :
            System.out.println("TUESDAY");
            break;
            case 3 :
            System.out.println("WEDNESDAY");
            break;
            case 4 :
            System.out.println("THURSDAY");
            break;
            case 5 :
            System.out.println("FRIDAY");
            break;
            case 6 :
            System.out.println("SATURDAY");
            break;
            case 7 :
            System.out.println("SUNDAY");
            break;
            default :
            System.out.println("INVALID CASE");
        }
        sc.close();
    }
} 