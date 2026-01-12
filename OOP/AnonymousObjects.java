class AnonymousObjects {
    String name;

    //CONSTRUCTOR
    public AnonymousObjects(){
        System.out.println("OBJECT IS CREATED");
    }

    //DISPLAYING NAME
    public void show(String name){
        this.name=name;
        System.out.println("NAME OF THE USER IS :"+this.name);
    }
    public static void main(String args[]){
        new AnonymousObjects().show("Vinamra"); //new AnonymousObjects() - is the anonymous object created here without creating reference variable
    }
}
