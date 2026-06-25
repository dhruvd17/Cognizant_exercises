package org.example;

public class PerformanceTester {

    public void performTask() {
        // simulate work
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}