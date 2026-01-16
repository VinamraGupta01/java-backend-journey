import java.util.*;
//import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();

        //ADDING ELEMENTS TO LIST
        list.add("C");
        list.add("PYTHON");
        list.add("JAVA");
        list.add("PHP");
        list.add("SQL");
        System.out.println("INITIAL LIST -> "+list);

        //LIST ITERATOR
        ListIterator<String> it=list.listIterator();

        //FORWARD TRAVERSAL
        while(it.hasNext()){
            String lang=it.next();
            System.out.print(lang+" ");

            //UPDATING ELEMENT USING LIST ITERATOR
        if(lang.equals("C")){
            it.set("C++");
            }        
        }
        System.out.println();

        //BACKWARD TRAVERSAL
        while(it.hasPrevious()){
            System.out.print(it.previous()+" ");
        }
        System.out.println();

        //ADDING ELEMENT USING LIST ITERATOR
        it.add("RUST");

        //FINALIZED LIST
        System.out.println("FINAL LIST -> "+list);
    }
}