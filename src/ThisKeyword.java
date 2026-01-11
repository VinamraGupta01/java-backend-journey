class ThisKeyword {
    private double balance;

    //CONSTRUCTOR
    public ThisKeyword(double balance){
        this.balance=balance;
    }

    //GETTER
    public double getBalance(){
        return this.balance;
    }

    //DEPOSIT AMOUNT
    public void depositAmount(double amount){
        this.balance=this.balance+amount;
    }

    //WITHDRAW AMOUNT
    public void withdrawAmount(double amount){
        if(amount>0 && this.balance>=amount){
            this.balance=this.balance-amount;
        }
        else{
            System.out.println("INSUFFICIENT BALANCE");
        }
    }
    public static void main(String args[]){
        ThisKeyword user=new ThisKeyword(1000000);
        user.depositAmount(1000);
        user.withdrawAmount(5500);
        System.out.println("TOTAL BALANCE =" +user.getBalance());
    }
}