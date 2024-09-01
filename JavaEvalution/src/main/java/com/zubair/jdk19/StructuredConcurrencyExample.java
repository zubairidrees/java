package com.zubair.jdk19;



import java.time.Duration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.StructuredTaskScope;

public class StructuredConcurrencyExample {
    public static final ScopedValue<String> USER_ID = ScopedValue.newInstance();
    public static void main(String[] args) {

        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            var future1 = scope.fork(() -> {
                ScopedValue.where(USER_ID, "user1").run(() -> {
                    System.out.println("User ID in thread: " + USER_ID.get());
                });
                Thread.sleep(Duration.ofSeconds(2));
                return "Task 1 completed";
            });
            var future2 = scope.fork(() -> {
                ScopedValue.where(USER_ID, "user2").run(() -> {
                    System.out.println("User ID in thread: " + USER_ID.get());
                });
                Thread.sleep(Duration.ofSeconds(3));
                return "Task 2 completed";
            });

            scope.join();  // Join both tasks
            scope.throwIfFailed();  // Propagate exceptions if any

            System.out.println(future1.get());
            System.out.println(future2.get());
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
