package com.zubair.jdk20;

import java.util.concurrent.StructuredTaskScope;

public class ScopedValuesExample {
    public static final ScopedValue<String> USER_ID = ScopedValue.newInstance();

    public static void main(String[] args) throws Exception {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            scope.fork(() -> {
                ScopedValue.where(USER_ID, "user1").run(() -> {
                    System.out.println("User ID in thread: " + USER_ID.get());
                });
                return USER_ID.get();
            });
            scope.join();
        }
    }
}
