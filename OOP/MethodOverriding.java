class Payment {
    public void processPayment(){
        System.out.println("SELECT THE TYPE OF PAYMENT MODE");
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void processPayment(){
        System.out.println("PAYMENT IS BEING MADE FROM CREDIT CARD");
    }
}

class UPIPayment extends CreditCardPayment {
    @Override
    public void processPayment(){
        System.out.println("PAYMENT IS BEING MADE FROM UPI ID");
    }
}

class MethodOverriding {
    public static void main(String args[]){
        UPIPayment pay=new UPIPayment();
        pay.processPayment();
    }
}
