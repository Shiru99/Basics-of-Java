package LogSystem;

import java.io.FileInputStream;
import java.util.logging.LogManager;

public class LoggingUtil {
    public static void initLogManager() throws Exception {
        LogManager.getLogManager().readConfiguration(
            new FileInputStream("LogSystem/Resources/logger.properties")
        );
    }
}
