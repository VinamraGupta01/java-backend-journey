class SharedResource {
    private int data;
    private boolean hasData = false;

    //PRODUCER METHOD
    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait(); //WAITS UNTIL DATA IS CONSUMED
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        data = value;
        hasData = true;
        System.out.println("Produced: " + data);

        notify(); //NOTIFY CUSTOMER
    }

    //CONSUMER METHOD
    public synchronized void consume() {
        while (!hasData) {
            try {
                wait(); // wait until data is produced
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Consumed: " + data);
        hasData = false;

        notify(); //NOTIFY PRODUCER
    }
}

//PRODUCER THREAD
class Producer extends Thread {
    private final SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
        }
    }
}

//CONSUMER THREAD
class Consumer extends Thread {
    private final SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
        }
    }
}

// MAIN CLASS
public class ThreadCommunication {
    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        Thread producer = new Producer(resource);
        Thread consumer = new Consumer(resource);

        producer.start();
        consumer.start();
    }
}
