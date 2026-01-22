import java.util.*;
//import java.util.Stack;

public class StackExample {
    public static void main(String args[]){
        Stack<String> s1=new Stack<String>();

        //ADDING ELEMENTS
        s1.push("A");
        s1.push("B");
        s1.push("C");
        s1.push("D");
        s1.push("E");
        s1.push("F");
        System.out.println("INITIAL STACK -> "+s1);

        //DELETING ELEMENTS FROM STACK
        String s=s1.pop(); //DELETES THE TOP (MOST RECENTLY ADDED) ELEMENT
        System.out.println("ELEMENT DELETED = "+s);

        //VIEWING THE ELEMENT AT TOP OF STACK
        System.out.println("THE TOPMOST ELEMENT IN STACK IS -> "+s1.peek());

        //RETURNING THE POSITION OF SPECIFIC ELEMENT FROM TOP (MOST RECENT ELEMENT)
        System.out.println("POSITION OF C IS = "+s1.search("C"));

        //TELLING WHETHER THE STACK IS EMPTY OR NOT (BOOLEAN VALUE)
        System.out.println(s1.empty());

        System.out.println("FINAL STACK IS -> "+s1);
    }
}
