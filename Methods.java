/* 
class Example {
    public String getName(String name){
        return name;
    }
}
class Methods {
    public static void main(String args[]){
        Example obj=new Example();
        String result=obj.getName("Vinamra");
        System.out.println(result);
    }
}
*/

//PRACTICE QUESTIONS RELATED TO METHODS

//Q1.Print the square of a number using methods
/* 
class Example {
    public int getSquare(int num){
        return num*num;
    }
}
class Methods {
    public static void main(String args[]){
        Example obj=new Example();
        int result=obj.getSquare(5);
        System.out.println(result);
    }
}
*/

//Q2.Print whether a number is even or odd using methods
/* 
class Example {
    public void checkNumber(int num){
        if(num%2==0){
            System.out.println("EVEN NUMBER");
        }
        else{
            System.out.println("ODD NUMBER");
        }
    }
}
class Methods {
    public static void main(String args[]){
        Example obj=new Example();
        obj.checkNumber(6);
    }
}
*/

//Q3.Print greeting message to the user
import java.util.*;
class Example {
    public void getGreetings(String name){
        System.out.println("Hello " +name+ "Welcome!" );
    }
}
class Methods {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        Example obj=new Example();
        obj.getGreetings(name);
    }
}