package org.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(
                    ParameterizedLoggingExample.class);

    public static void main(String[] args) {

        String username = "John";
        int age = 25;
        String city = "New York";

        logger.info(
                "User {} is {} years old and lives in {}",
                username,
                age,
                city
        );

        logger.warn(
                "User {} has not logged in for {} days",
                username,
                30
        );

        logger.error(
                "Failed to process request for user {}",
                username
        );
    }
}