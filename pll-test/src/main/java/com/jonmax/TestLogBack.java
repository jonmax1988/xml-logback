package com.jonmax;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogBack {

    private static final Logger logger = LoggerFactory.getLogger(TestLogBack.class);
    public static void main(String[] args) {
        for(int i=0;i<10000;i++){
            logger.trace("jon max");
            logger.debug("jon max");
            logger.info("jon max");
            logger.warn("jon max");
        }

    }
}
