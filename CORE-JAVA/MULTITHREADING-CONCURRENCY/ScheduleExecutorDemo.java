import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class DelayedTask implements Runnable {

    @Override
    public void run(){
        System.out.println("TASK EXECUTED AT "+System.currentTimeMillis()+ " BY "+Thread.currentThread().getName());
    }
}

public class ScheduleExecutorDemo {
    public static void main(String[] args) {

        ScheduledExecutorService scheduler=Executors.newScheduledThreadPool(1);

        System.out.println("TASKS SCHEDULED");

        scheduler.schedule(new DelayedTask(),3,TimeUnit.SECONDS);

        scheduler.shutdown();
    }
}