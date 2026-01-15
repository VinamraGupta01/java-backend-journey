import java.util.*;
//import java.util.TreeSet;
//import java.util.Iterator;

public class TreeSetExample {
    public static void main(String args[]){
        TreeSet<Integer> tset=new TreeSet<Integer>();

        //ADDING ELEMENTS IN THE SET
        tset.add(10);
        tset.add(20);
        tset.add(30);
        tset.add(40);
        tset.add(50);
        tset.add(60);
        System.out.println("INTITAL SET -> "+tset);

        //CHECKING IF AN ELEMENT EXISTS IN THE SET OR NOT
        if(tset.contains(30)){
            System.out.println("YES 30 IS PRESENT IN THE SET");
        }

        //DELETING A SPECIFIC ELEMENT
        tset.remove(60);
        System.out.println("SET AFTER DELETION -> "+tset);

        //ACCESSING FIRST ELEMENT OF THE SET
        System.out.println(tset.first());

        //ACCESSING LAST ELEMENT OF THE SET
        System.out.println(tset.last());

        //REMOVING FIRST ELEMENT FROM THE SET
        tset.pollFirst();

        //REMOVING LAST ELEMENT FROM THE SET
        tset.pollLast();

        //RETURNING ELEMENTS LESS THAN 40
        System.out.println(tset.headSet(40));

        //RETURNING ELEMENTS GREATER THAN OR EQUAL TO 20
        System.out.println(tset.tailSet(20));

        //ITERATING THE SET
        Iterator<Integer> it=tset.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        //FINALIZED SET IS
        System.out.println("FINAL SET -> "+tset);
    }
}