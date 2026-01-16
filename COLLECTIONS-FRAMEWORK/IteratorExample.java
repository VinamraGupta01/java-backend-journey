import java.util.*;
//import java.util.Iterator;

public class IteratorExample {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();

        //ADDING ELEMENTS TO THE LIST
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("INITIAL LIST -> "+list);

        //ITERATOR (TO TRAVERSE/ITERATE THE LIST)
        Iterator<Integer> it=list.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        //FINALIZED LIST
        System.out.println("FINAL LIST -> "+list);
    }
}