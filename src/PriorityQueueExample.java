import java.util.*;
//import java.util.Queue;

//IMPLEMENTING QUEUE USING PRIORITY QUEUE
 
class PriorityQueueExample {
        public static void main(String args[]) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //ADDING ELEMENTS
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(50);

        System.out.println("PRIORITY QUEUE -> " + pq);

        //HEAD ELEMENT (SMALLEST)
        System.out.println("HEAD ELEMENT -> " + pq.peek());

        //REMOVE HEAD ELEMENT
        pq.poll();
        System.out.println("AFTER poll() -> " + pq);

        // ITERATING
        System.out.print("ELEMENTS -> ");
        for (int x : pq) {
            System.out.print(x + " ");
        }
        System.out.println();

        //CHECK EMPTY
        System.out.println("IS THE QUEUE EMPTY? " + pq.isEmpty());
    }
}
