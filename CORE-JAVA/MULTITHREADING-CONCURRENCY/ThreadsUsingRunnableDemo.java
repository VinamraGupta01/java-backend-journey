class Task implements Runnable {
    private final String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName + " STARTED BY : " + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }

        System.out.println(taskName + " COMPLETED BY : " + Thread.currentThread().getName());
    }
}

public class ThreadsUsingRunnableDemo {
    public static void main(String[] args) {

        Runnable task1 = new Task("MUSIC");
        Runnable task2 = new Task("FILE EXPLORER");

        Thread t1 = new Thread(task1, "Thread-1");
        Thread t2 = new Thread(task2, "Thread-2");

        t1.start();
        t2.start();
    }
}
