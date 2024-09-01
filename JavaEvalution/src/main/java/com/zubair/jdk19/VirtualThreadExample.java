package com.zubair.jdk19;

public class VirtualThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread virtualThread = Thread.ofVirtual().start(() -> {
            System.out.println("Hello from virtual thread!");
        });

        virtualThread.join();  // Wait for the virtual thread to complete
    }
}

