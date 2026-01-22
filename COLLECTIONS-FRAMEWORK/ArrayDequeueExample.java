import java.util.*;
//import java.util.Queue;

//IMPLEMENTING QUEUE USING ARRAY DEQUEUE

public class ArrayDequeueExample {
    public static void main(String args[]){
        ArrayDeque<String> dq = new ArrayDeque<String>();

        //ADDING ELEMENTS
        dq.add("A");
        dq.add("B");
        dq.add("C");

        dq.addFirst("START");
        dq.addLast("END");

        System.out.println("ARRAY DEQUE -> " + dq);

        //REMOVE ELEMENTS
        dq.removeFirst();
        dq.removeLast();

        System.out.println("AFTER REMOVAL -> " + dq);

        //ACCESS
        System.out.println("FIRST -> " + dq.peekFirst());
        System.out.println("LAST -> " + dq.peekLast());
    }
}
