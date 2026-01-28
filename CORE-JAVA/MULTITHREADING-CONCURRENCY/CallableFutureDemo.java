import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

class SumTask implements Callable<Integer> {
    
    private final int a;
    private final int b;

    public SumTask(int a,int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("CALCULATING SUM IN "+Thread.currentThread().getName());

        Thread.sleep(2000);
        return a+b;
    }
}

public class CallableFutureDemo {
    public static void main(String[] args) throws Exception {
        
        //CREATING EXECUTOR
        ExecutorService executor=Executors.newFixedThreadPool(2);

        //SUBMIT TASK AND GET FUTURE
        Future<Integer> result=executor.submit(new SumTask(10,20));

        //GETTING RESULT
        System.out.println("WAITING FOR RESULT...");
        Integer sum=result.get();
        System.out.println("RESULT = "+sum);

        //SHUTTING EXECUTOR DOWN
        executor.shutdown();
    }
}