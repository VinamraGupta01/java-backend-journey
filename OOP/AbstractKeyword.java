//ASBTRACT CLASS
abstract class Payment {
    //ABSTRACT METHOD
    public abstract void makePayment();

    public void showMessage(){
        System.out.println("THE PAYMENT IS BEING PROCESSED");
    }
}

class UPIPayment extends Payment {
    @Override
    public void makePayment(){
        System.out.println("PAYMENT IS BEING PROCESSED USING UPI");
    }
}

class CreditCard extends Payment {
    @Override
    public void makePayment(){
        System.out.println("PAYMENT IS BEING PROCESSED USING CREDIT CARD");
    }
}

class AbstractKeyword {
    public static void main(String args[]){
        Payment user1=new UPIPayment();
        user1.makePayment();

        Payment user2=new CreditCard();
        user2.makePayment();
    }
}