/*
TYPES OF INHERITANCE IN JAVA

1. SINGLE INHERITANCE : (PARENT->CHILD)
2. MULTILEVEL INHERITANCE : (GRANDPARENT->PARENT->CHILD)
3. HIERARCHIAL INHERITANCE : (PARENT->CHILD 1,CHILD 2)
4. HYBRID INHERITANCE : (COMBINATION OF OTHER TYPES OF INHERITANCE)
5. MULTIPLE INHERITANCE : (PARENT 1,PARENT 2->CHILD) 
*/

//1. SINGLE INHERITANCE
 
class BankAccount {
    protected double balance;
    
    public void depositAmount(double amount){
        balance+=amount;
    }
}

class Inheritance extends BankAccount {
    public double interestRate=5.0;

    public void displayBalance(){
        System.out.println("Total Balance is =" +balance);
        System.out.println("Interest Rate avaiable is =" +interestRate);
    }
    public static void main(String args[]){
        Inheritance user=new Inheritance();
        user.depositAmount(10000000);
        user.displayBalance();
        user.depositAmount(500);
        user.displayBalance();
    }
}



