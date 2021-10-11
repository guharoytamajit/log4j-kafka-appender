package com.demo.log4j2.appender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] argv) {
        System.out.println("Inside HelloKafkaLogger.main");


            logger.debug("Debug message from HelloKafkaLogger.main," );
            logger.info("Info message from HelloKafkaLogger.main" );
            logger.warn("Warn message from HelloKafkaLogger.main");
            logger.error("Error message from HelloKafkaLogger.main" );

        System.out.println("Exiting HelloKafkaLogger.main");
 
    }
}
