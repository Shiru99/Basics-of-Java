package LogSystem;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogExample {

    public static final Logger LOGGER = Logger.getLogger(LogExample.class.getName());
    
    static{
        LOGGER.setLevel(Level.FINER); // Message levels lower than this value will be discarded
        ConsoleHandler consoleHandler = new ConsoleHandler();   
        consoleHandler.setLevel(Level.FINER); // Message levels lower than this value will be discarded
        LOGGER.addHandler(consoleHandler);
    }
    
    public static void main(String[] args) {

        // LOGGER.log(Level.SEVERE, "Log - Hello World");
        // LOGGER.log(Level.WARNING, "Log - Hello World");
        // LOGGER.log(Level.INFO, "Log - Hello World");
        // LOGGER.log(Level.FINER, "Log - Hello World");

        /* Console Handler */
        

        LOGGER.log(Level.INFO, "INFO Log - Hello World");
        LOGGER.log(Level.FINER, "FINER Log - Hello World");
        LOGGER.log(Level.FINEST, "FINEST Log - Hello World");


    }
}