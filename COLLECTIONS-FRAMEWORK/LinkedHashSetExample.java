import java.util.*;
//import java.util.LinkedHashSet;
//import java.util.Iterator;

public class LinkedHashSetExample {
    public static void main(String args[]){
        LinkedHashSet<String> lh=new LinkedHashSet<String>();

        //ADDING ELEMENTS IN THE SET
        lh.add("APPLE");
        lh.add("GUAVA");
        lh.add("PINEAPPLE");
        lh.add("CHERRY");
        lh.add("MANGO");
        lh.add("BANANA");
        System.out.println("INITIAL SET -> "+lh);

        //CHECKING IF A SPECIFIC ELEMENT EXISTS OR NOT
        if(lh.contains("GUAVA")){
            System.out.println("YES GUAVA EXISTS");
        }
        else{
            System.out.println("GUAVA OESNT EXISTS");
        }

        //DELETING AN ELEMENT FROM SET
        if(lh.contains("PINEAPPLE")){
            lh.remove("PINEAPPLE");
        }

        //ITERATING THE SET
        Iterator<String> it=lh.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        //RETURNING THE SIZE OF THE SET
        System.out.println("SIZE OF THE SET IS = "+lh.size());

        //PRINTING FINALIZED SET
        System.out.println(lh);
    }
}