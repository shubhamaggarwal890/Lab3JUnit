import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Multiplication {
    private static final Logger logger = LogManager.getLogger(Multiplication.class);

    public int multiply(int a, int b) {
        logger.info("Multiplication operation for numbers "+a+" and "+b);
        return a * b;
    }
}
