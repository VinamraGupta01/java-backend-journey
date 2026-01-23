/* 
WAP to validate a user's age for driving license eligibility.
• Take an integer input: age
• If age is less than 18:
    → explicitly throw an IllegalArgumentException using the throw keyword
• If age is 18 or above:
    → print "You are eligible to apply for a driving license"
Handle the exception using try–catch and print a meaningful error message.
Ensure the program terminates gracefully.
*/
import java.util.*;

class ThrowExceptionDemo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        try{
            int age=sc.nextInt();
            if(age<18){
                throw new IllegalArgumentException("NOT ELIGIBLE FOR DRIVING LICENSE");
            }
            System.out.println("ELIGIBLE FOR DRIVING LICENSE");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("PROGRAM EXECUTION COMPLETED!");
        }
        sc.close();
    }
}