import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddress {

    private static final Logger logger = LogManager.getLogger(EmailAddress.class);
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static void main(String[] args) {
        System.out.println("Test start");
    }

    Boolean verifyEmailAddress(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        logger.info("Verifying Email address " + email);
        return matcher.find();
    }
}
