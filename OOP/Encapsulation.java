//DEMONSTRATING ENCAPSULATION USING A BANK ACCOUNT EXAMPLE
class Encapsulation {

    //PRIVATE (HIDDEN) DATA
    private double balance; 

    //GETTER
    public double getBalance() {
        return balance;
    }

    //DEPOSIT AMOUNT
    public void depositAmount(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("INVALID DEPOSIT AMOUNT");
        }
    }

    //WITHDRAWING AMOUNT
    public void withdrawAmount(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("INSUFFICIENT BALANCE");
        }
    }
    public static void main(String[] args) {
        Encapsulation user = new Encapsulation();

        user.depositAmount(100000);
        user.withdrawAmount(100);
        System.out.println("TOTAL BALANCE = " + user.getBalance());
    }
}
