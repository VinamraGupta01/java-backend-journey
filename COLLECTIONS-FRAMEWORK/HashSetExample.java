import java.util.*;
//import java.util.HashSet;
//import java.util.Iterator

public class HashSetExample {
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<Integer>();

        //ADDING ELEMENTS IN SET
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("INITIAL SET -> " +set);

        //CHECKING IF SPECIFIC ELEMENTS EXISTS IN SET OR NOT
        if(set.contains(2)){
            System.out.println("YES 2 EXISTS");
        }
        else {
            System.out.println("DOESN'T EXISTS");
        }

        //DELETING ANY SPECIFIC ELEMENT FROM SET
        if(set.contains(5)){
            set.remove(5);
        }
        else {
        System.out.println("5 DOESN'T EXISTS");
        }
        //PRINTING SIZE OF SET
        System.out.println("SIZE OF THE SET IS = "+set.size());

        //ITERATING SET USING ITERATOR
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        //FINAL SET
        System.out.println("FINALIZED SET IS -> "+set);
    }
}