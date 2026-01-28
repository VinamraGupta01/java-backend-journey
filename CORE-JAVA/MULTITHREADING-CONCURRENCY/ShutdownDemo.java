import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {

    private final String name;

    public Task(String name){
        this.name=name;
    }

    @Override
    public void run(){
        System.out.println(name+ " STARTED BY "+Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }

        System.out.println("FINISHED");
    }
}

public class ShutdownDemo {
    public static void main(String[] args) {
        
        ExecutorService executor=Executors.newFixedThreadPool(2);

        executor.submit(new Task("MUSIC"));
        executor.submit(new Task("VS CODE"));
        executor.submit(new Task("FILE EXPLORER"));
        executor.submit(new Task("YOUTUBE"));

        //STOP ACCEPTING NEW TASKS
        executor.shutdown();

        try {
            //WAIT FOR TASKS TO FINISH
            if(!executor.awaitTermination(5,TimeUnit.SECONDS)){
            System.out.println("FORCING SHUTDOWN");
            executor.shutdownNow();
        }
    } catch(InterruptedException e){
        executor.shutdownNow();
    }

    System.out.println("EXECUTOR SHUTDOWN COMPLETED");
    }
}