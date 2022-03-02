package com.learning.Log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {
    public static Logger log = LogManager.getLogger();
        public static void main(String args[]){
         log.info("test");
         log.fatal("fatal");
         log.error("error");
         log.debug("debug");
        }
}
