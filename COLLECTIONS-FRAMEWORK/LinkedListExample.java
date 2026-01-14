import java.util.*;
//import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String args[]){
        LinkedList<String> fruits=new LinkedList<String>();

        //ADDING ELEMENTS IN LINKED LIST
        fruits.add("MANGO");
        fruits.add("PINEAPPLE");
        fruits.add("GUAVA");
        fruits.add("KIWI");
        fruits.add("BANANA");
        System.out.println("INITIAL LINKED LIST -> "+fruits);

        //ADDING ELEMENT AT A SPECIFIC LOCATION
        fruits.add(2,"CHERRY");
        System.out.println(fruits);

        //ADDING ELEMENT AT THE START OF LINKED LIST
        fruits.addFirst("APPLE");

        //ADDING ELEMENT AT THE LAST OF LINKED LIST
        fruits.addLast("DRAGON FRUIT");

        System.out.println("LINKED LIST AFTER ALL INSERTIONS -> "+fruits);

        //REMOVING A SPECIFIC ELEMENT
        fruits.remove("GUAVA");

        //REMOVING FIRST AND LAST ELEMENT 
        fruits.removeFirst();
        fruits.removeLast();

        System.out.println("LINKED LIST AFTER REMOVAL OF ELEMENTS -> "+fruits);

        //ACCESSING FIRST AND LAST ELEMENTS
        System.out.println(fruits.getFirst());
        System.out.println(fruits.getLast());

        //ITERATING LINKED LIST
        for(String fruit : fruits){
            System.out.print(" "+fruit+" ");
        }
        System.out.println();

        System.out.println("FINAL LINKED LIST -> "+fruits);
    }
}
