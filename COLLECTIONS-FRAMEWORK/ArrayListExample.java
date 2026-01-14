import java.util.*;
//import java.util.ArrayList;
//import java.util.Collections;

public class ArrayListExample {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();

        //ADDING ELEMENTS IN THE LIST
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(60);

        //ACCESSING ELEMENT FROM LIST
        int element=list.get(3); //INDEX VALUE
        System.out.println(element);

        //ADD ELEMENT AT A SPECIFIC LOCATION
        list.add(2,30); //INDEX,ELEMENT
        System.out.println(list);

        //SET/UPDATE ELEMENT OF A SPECIFIC LOCATION
        list.set(5,55);
        System.out.println(list); //INDEX,VALUE

        //DELETE AN ELEMENT FROM LIST
        list.remove(5);
        System.out.println(list);

        //DISPLAY THE SIZE OF THE LIST
        int size=list.size();
        System.out.println(size);

        //ITERATING ARRAYLIST
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            System.out.print(" ");
        }

        //SORTING ELEMENTS OF LIST
        Collections.sort(list); //ASCENDING ORDER
        System.out.println(list);
    }
}
