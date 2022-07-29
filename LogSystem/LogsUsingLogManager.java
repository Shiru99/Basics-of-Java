package LogSystem;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogsUsingLogManager {

    public static final Logger LOGGER = Logger.getLogger(LogsUsingLogManager.class.getName());
    
    public static void main(String[] args) throws Exception {

        // Using LogManager : Console Handler  + File Handler
        
        LoggingUtil.initLogManager();

        LOGGER.log(Level.SEVERE, "SEVERE Log - Hello World");
        LOGGER.log(Level.WARNING, "WARNING Log - Hello World");
        LOGGER.log(Level.INFO, "INFO Log - Hello World");
        LOGGER.log(Level.FINER, "FINER Log - Hello World");
        LOGGER.log(Level.FINEST, "FINEST Log - Hello World");

    }
}