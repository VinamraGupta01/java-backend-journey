// LIFE CYCLE OF THREADS
// NEW -> RUNNABLE -> RUNNING -> TIMED_WAITING -> TERMINATED

class LifeCycle implements Runnable {

    @Override
    public void run() {
        System.out.println("THREAD IS RUNNING : " +
                Thread.currentThread().getName());

        try {
            Thread.sleep(1000); // TIMED_WAITING
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("THREAD EXECUTION COMPLETED : " +
                Thread.currentThread().getName());
    }
}

public class ThreadLifeCycleDemo {
    public static void main(String[] args) {

        Runnable task = new LifeCycle();
        Thread t1 = new Thread(task, "WORKER-THREAD");

        // 1. NEW
        System.out.println("STATE AFTER CREATION : " + t1.getState());

        // 2. RUNNABLE
        t1.start();
        System.out.println("STATE AFTER START() : " + t1.getState());

        try {
            // WAIT FOR THREAD TO FINISH
            t1.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // 5. TERMINATED
        System.out.println("STATE AFTER TERMINATION : " + t1.getState());
    }
}
