import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;
public class HelloLog {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        // passing first argument
        logger.error(args[0]);

    }
}

