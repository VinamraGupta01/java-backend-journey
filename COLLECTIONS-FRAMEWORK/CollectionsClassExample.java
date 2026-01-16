import java.util.*;
//import java.util.Collections;

public class CollectionsClassExample {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();

        //ADDING ELEMENTS TO THE LIST
        list.add(40);
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(60);
        list.add(30);
        System.out.println("INITIAL LIST -> "+list);

        //SORTING THE LIST
        Collections.sort(list);
        System.out.println("LIST AFTER SORTING -> "+list);

        //FINDING MAXIMUM ELEMENT FROM LIST
        System.out.println("MAXIMUM ELEMENT IN THE LIST = "+Collections.max(list));

        //FINDING MINIMUM ELEMENT IN THE LIST
        System.out.println("MINIMUM ELEMENT IN THE LIST = "+Collections.min(list));

        //PRINTING LIST IN REVERSE ORDER
        Collections.reverse(list);
        System.out.println("LIST AFTER REVERSAL -> "+list);

        //SHUFFLING THE LIST
        Collections.shuffle(list);
        System.out.println("LIST AFTER SHUFFLING -> "+list);
    }
}