import java.util.concurrent.CompletableFuture;

public class CompletableFutureAdvanceDemo {

    public static void main(String[] args) {

        CompletableFuture<String> composedFuture =
                getUserId()
                        .thenCompose(id -> getUserName(id));

        CompletableFuture<String> combinedFuture =
                getUserAge()
                        .thenCombine(getUserCity(),
                                (age, city) -> "AGE : " + age + ", CITY : " + city);

        CompletableFuture<String> handledFuture =
                riskyTask()
                        .handle((result, exception) -> {
                            if (exception != null) {
                                return "ERROR HANDLED : " + exception.getMessage();
                            }
                            return result;
                        });

        CompletableFuture<String> finalFuture =
                getUserId()
                        .thenCompose(id -> getUserName(id))
                        .whenComplete((result, exception) -> {
                            if (exception == null) {
                                System.out.println("TASK COMPLETED SUCCESSFULLY");
                            } else {
                                System.out.println("TASK FAILED");
                            }
                        });

        System.out.println("thenCompose RESULT : " + composedFuture.join());
        System.out.println("thenCombine RESULT : " + combinedFuture.join());
        System.out.println("handle RESULT      : " + handledFuture.join());
        System.out.println("whenComplete RESULT : " + finalFuture.join());
    }

    static CompletableFuture<Integer> getUserId() {
        return CompletableFuture.supplyAsync(() -> {
            sleep(1000);
            return 101;
        });
    }

    static CompletableFuture<String> getUserName(int id) {
        return CompletableFuture.supplyAsync(() -> {
            sleep(1000);
            return "USER -" + id;
        });
    }

    static CompletableFuture<Integer> getUserAge() {
        return CompletableFuture.supplyAsync(() -> {
            sleep(1000);
            return 22;
        });
    }

    static CompletableFuture<String> getUserCity() {
        return CompletableFuture.supplyAsync(() -> {
            sleep(1000);
            return "DELHI";
        });
    }

    static CompletableFuture<String> riskyTask() {
        return CompletableFuture.supplyAsync(() -> {
            throw new RuntimeException("SOMETHING WENT WRONG");
        });
    }

    static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
