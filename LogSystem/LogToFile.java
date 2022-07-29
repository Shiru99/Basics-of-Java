package LogSystem;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogToFile {

    public static final Logger LOGGER = Logger.getLogger(LogToFile.class.getName());
    
    static{

        try {
            LOGGER.setLevel(Level.FINER); 
            FileHandler fileHandler = new FileHandler("LogSystem/Logs/LogsToFile.log", false); 
            // true - append to existing file
            fileHandler.setFormatter(new SimpleFormatter());

            Filter filter = log -> log.getLevel().intValue() >= Level.WARNING.intValue();
            fileHandler.setFilter(filter);


            fileHandler.setLevel(Level.FINER); 
            LOGGER.addHandler(fileHandler);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        } 

    }
    
    public static void main(String[] args) {

        /* Console Handler + File Handler */
        

        LOGGER.log(Level.SEVERE, "SEVERE Log - Hello World");
        LOGGER.log(Level.WARNING, "WARNING Log - Hello World");
        LOGGER.log(Level.INFO, "INFO Log - Hello World");
        LOGGER.log(Level.FINER, "FINER Log - Hello World");
        LOGGER.log(Level.FINEST, "FINEST Log - Hello World");


    }
}