class ThisKeyword {
    public String model;
    public double price;
    ThisKeyword(String m,double p){
        this.model=m;
        this.price=p;
    }

    public void display(){
        System.out.println("MODEL OF PHONE IS :"+model);
        System.out.println("PRICE OF THE PHONE IS :"+price);
    }

    public static void main(String args[]){
        ThisKeyword mobile=new ThisKeyword("SamsuNG",100500);
        mobile.display();
    }
}
