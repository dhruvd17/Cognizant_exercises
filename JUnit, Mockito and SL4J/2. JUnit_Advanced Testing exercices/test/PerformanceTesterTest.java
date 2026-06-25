package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

public class PerformanceTesterTest {

    @Test
    void testTimeout() {
        PerformanceTester pt = new PerformanceTester();

        assertTimeout(Duration.ofSeconds(1), pt::performTask);
    }
}