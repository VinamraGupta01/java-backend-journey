class Counter {
    public int count;

    void increment(){
        count++;
    }
}

class Worker extends Thread {
    private Counter counter;

    public Worker(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run(){
        for(int i=1;i<=1000;i++){
        counter.increment();
        }
    }
}

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        
        Counter counter=new Counter();

        Worker t1=new Worker(counter);
        Worker t2=new Worker(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("FINAL COUNT : "+counter.count);
    }
}