/*
WAP to validate ATM withdrawal amoun
Create InsufficientBalanceException
If withdrawal > balance → throw custom exception
Handle it using try–catch
Print meaningful message
End program gracefully
*/
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}

class BalanceVerifier {
    public void withdraw(int balance, int withdrawAmount)
            throws InsufficientBalanceException {
        if (withdrawAmount > balance) {
            throw new InsufficientBalanceException(
                "WITHDRAWAL AMOUNT EXCEEDS THE BALANCE"
            );
        }
        System.out.println("WITHDRAWAL SUCCESSFUL");
        System.out.println("REMAINING BALANCE : $" + (balance - withdrawAmount));
    }
}


class CustomExceptions {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

        try {
            System.out.print("ENTER BALANCE : ");
            int balance = sc.nextInt();

            System.out.print("ENTER WITHDRAWAL AMOUNT : ");
            int withdrawAmount = sc.nextInt();

            BalanceVerifier bv = new BalanceVerifier();
            bv.withdraw(balance, withdrawAmount);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        finally {
            System.out.println("PROGRAM EXECUTION COMPLETED");
        }
        sc.close();
    }
}