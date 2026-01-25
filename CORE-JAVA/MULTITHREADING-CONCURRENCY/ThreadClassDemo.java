class MyThread extends Thread {

    private final String taskName;

    //CREATING CONSTRUCTOR TO INITIALIZE TASKNAME
    public MyThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(
            taskName + " STARTED BY : " + Thread.currentThread().getName()
        );

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); 
        }

        System.out.println(
            taskName + " COMPLETED BY : " + Thread.currentThread().getName()
        );
    }
}

public class ThreadClassDemo {
    public static void main(String[] args) {

        //CREATING THREADS
        MyThread t1 = new MyThread("MUSIC");
        MyThread t2 = new MyThread("GAMES");

        //CALLING RUN METHOD USING START()
        t1.start();
        t2.start();
    }
}
