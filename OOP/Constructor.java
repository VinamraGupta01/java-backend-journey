//DEFAULT CONSTRUCTOR
/* 
class Constructor {

    public String name;

    //CONSTRUCTOR
    public Constructor(){
        name="Vinamra";
    }
    public static void main(String args[]){
        Constructor user=new Constructor();
        System.out.println("NAME OF THE USER IS :" +user.name);
    }
}
*/

//PARAMETERIZED CONSTRUCTOR 
class Constructor {
    public String name;
    public int age;

    //CONSTRUCTOR WITH PARAMETERS
    public Constructor(String n,int a){
        this.name=n;
        this.age=a;
    }

    //DISPLAY NAME AND AGE
    public void display(){
        System.out.println("NAME OF THE USER IS :" +this.name);
        System.out.println("AGE OF THE USER IS :" +this.age);
    }

    public static void main(String args[]){
        Constructor user=new Constructor("Vinamra",19);
        user.display();
    }
}
