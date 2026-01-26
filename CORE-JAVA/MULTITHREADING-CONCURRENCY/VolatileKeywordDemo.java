class Worker extends Thread {
    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Thread stopped.");
    }

    public void stopThread() {
        running = false;
    }
}

public class VolatileKeywordDemo {
    public static void main(String[] args) throws InterruptedException {

        Worker worker = new Worker();
        worker.start();

        Thread.sleep(2000); //LET THREAD RUN
        worker.stopThread(); //SAFELY STOP IT
    }
}
