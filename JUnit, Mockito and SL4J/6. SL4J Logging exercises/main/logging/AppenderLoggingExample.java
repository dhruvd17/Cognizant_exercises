package org.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(
                    AppenderLoggingExample.class);

    public static void main(String[] args) {

        logger.info("Application started");

        logger.debug("Debug message");

        logger.warn("Warning message");

        logger.error("Error message");

        logger.info("Application finished");
    }
}