/*
WAP that Takes-:
two integers- i) totalAmount,ii) numberOfPeople
Calculate amount per person using division.
Use try–catch to handle:
ArithmeticException → when numberOfPeople is 0
NullPointerException → if any variable is not initialized
Print:
"Amount per person: X" if calculation is successful
A meaningful error message for each exception
*/
import java.util.*;

public class TryCatchExceptionDemo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int totalAmount=sc.nextInt();
        int numberOfPeople=sc.nextInt();
        int amountPerPerson;

        try{
            amountPerPerson=totalAmount/numberOfPeople;
            System.out.println("AMOUNT PER PERSON = $"+amountPerPerson);
        }catch(ArithmeticException a){
                System.out.println("CANT DIVIDE WITH 0 "+a.getMessage());
        }catch(NullPointerException n){
            System.out.println("NO VARIABLE IS INITIALIZED "+n.getMessage());
        }catch(Exception e){
            System.out.println("UNEXPECTED ERROR! "+e.getMessage());
        }

        finally{
            System.out.println("EXECUTION COMPLETED");
        }

        sc.close();
    }
}