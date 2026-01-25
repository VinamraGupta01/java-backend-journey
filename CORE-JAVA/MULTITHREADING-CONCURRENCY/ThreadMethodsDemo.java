class Worker extends Thread {

    public Worker(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " started");

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " working step " + i);
                Thread.sleep(500);   
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted safely");
        }

        System.out.println(getName() + " finished");
    }
}

public class ThreadMethodsDemo {
    public static void main(String[] args) throws InterruptedException {

        Worker t1 = new Worker("Worker-1");
        Worker t2 = new Worker("Worker-2");

        System.out.println("Is t1 alive? " + t1.isAlive()); //FALSE

        t1.start();
        t2.start();

        System.out.println("Is t1 alive after start? " + t1.isAlive()); //TRUE

        // join() -> MAIN THREAD WAITS
        t1.join();
        System.out.println("Main waited for Worker-1");

        // interrupt()
        t2.interrupt();

        System.out.println("Main thread finished");
    }
}
