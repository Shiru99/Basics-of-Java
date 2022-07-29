package LogSystem;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogToFile {

    public static final Logger LOGGER = Logger.getLogger(LogToFile.class.getName());
    
    static{

        try {
            LOGGER.setLevel(Level.FINER); 
            FileHandler fileHandler = new FileHandler("LogSystem/Logs/LogToFile.log", false); 
            // true - append to existing file
            fileHandler.setFormatter(new SimpleFormatter());
            fileHandler.setLevel(Level.FINER); 
            LOGGER.addHandler(fileHandler);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        } 

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