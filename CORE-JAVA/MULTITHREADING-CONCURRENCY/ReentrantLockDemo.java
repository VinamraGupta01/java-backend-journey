import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count=0;
    private final ReentrantLock rl=new ReentrantLock();

    public void increment(){
        rl.lock();

        try {
            count++;
        }
        finally {
            rl.unlock();
        }
    }

    public int getCount(){
        return count;
    }
}

class Worker extends Thread {
    private final Counter counter;

    public Worker(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            counter.increment();
        }
    }
}

class ReentrantLockDemo {
    public static void main(String[] args) throws InterruptedException {

        Counter counter=new Counter();

        Thread t1=new Worker(counter);
        Thread t2=new Worker(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("FINAL COUNT : "+counter.getCount());
    }
}