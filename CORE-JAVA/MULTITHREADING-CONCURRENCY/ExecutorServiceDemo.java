import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

    private final String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName + " executed by " + Thread.currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ExecutorServiceDemo {
    public static void main(String[] args) {

        //CREATING THREAD POOL WITH 2 THREADS
        ExecutorService executor = Executors.newFixedThreadPool(2);

        //SUBMITTING TASKS
        executor.execute(new Task("TASK-1"));
        executor.execute(new Task("TASK-2"));
        executor.execute(new Task("TASK-3"));
        executor.execute(new Task("TASK-4"));

        //SHUTTING DOWN EXECUTOR
        executor.shutdown();

        System.out.println("ALL TASKS SUBMITTED");
    }
}
