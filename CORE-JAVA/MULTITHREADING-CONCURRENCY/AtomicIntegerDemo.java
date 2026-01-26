import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    AtomicInteger count = new AtomicInteger(0);

    void increment() {
        count.incrementAndGet(); // ATOMIC
    }
}

class Worker extends Thread {
    private final Counter counter;

    Worker(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            counter.increment();
        }
    }
}

public class AtomicIntegerDemo {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Worker(counter);
        Thread t2 = new Worker(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("FINAL COUNT = " + counter.count.get());
    }
}
