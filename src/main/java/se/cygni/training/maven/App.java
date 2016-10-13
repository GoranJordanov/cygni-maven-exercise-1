package se.cygni.training.maven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main class
 */
public class App {

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(App.class);
        logger.info("Starting up");
        System.out.println("Starting up");
        StringGetter getter = new StringGetter();
        System.out.println(getter.getStringFromResource());
    }
}
