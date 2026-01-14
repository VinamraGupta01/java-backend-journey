import java.util.*;
//import java.util.Queue;

//IMPLEMENTING QUEUE USING LINKED LIST
 
public class QueueExample {
    public static void main(String args[]) {

        Queue<Integer> q1 = new LinkedList<>();

        //ADDING ELEMENTS
        q1.add(10);
        q1.offer(20);
        q1.add(30);
        q1.offer(40);
        q1.add(50);

        System.out.println("INITIAL QUEUE -> " + q1);

        //VIEWING FIRST ELEMENT
        System.out.println("HEAD ELEMENT -> " + q1.peek());

        //REMOVING ELEMENT USING remove()
        q1.remove();
        System.out.println("QUEUE AFTER remove() -> " + q1);

        //REMOVING ELEMENT USING poll()
        q1.poll();
        System.out.println("QUEUE AFTER poll() -> " + q1);

        //CHECK IF QUEUE IS EMPTY
        System.out.println("IS THE QUEUE EMPTY? " + q1.isEmpty());
    }
}




