import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

    public static void main(String[] args) {

        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() -> {
                    // BACKGROUND TASK
                    System.out.println(
                        "FETCHING DATA IN : " +
                        Thread.currentThread().getName()
                    );

                    sleep(2000); //SIMULATE DELAY
                    return "USER DATA";
                })
                .thenApply(data -> {
                    //PROCESS DATA
                    System.out.println(
                        "PROCESSING DATA IN : " +
                        Thread.currentThread().getName()
                    );
                    return data.toUpperCase();
                })
                .thenApply(processedData -> {
                    //FINAL TRANSFORMATION
                    return "PROCESSED DATA IS : " + processedData;
                })
                .exceptionally(ex -> {
                    return "ERROR OCCURRED : " + ex.getMessage();
                });

        //MAIN THREAD CONTINUES DOING OTHER WORK
        System.out.println("MAIN THREAD IS FREE");

        //GET FINAL RESULT ONLY WHEN NEEDED
        String result = future.join();
        System.out.println(result);
    }

    //UTILITY METHOD TO SIMULATE DELAY
    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
