import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddress {

    private static final Logger logger = LogManager.getLogger(IPAddress.class);
    public static final Pattern VALID_IP_ADDRESS_REGEX = Pattern.compile("\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}\b");

    boolean verifyIPAddress(String ipaddress){
        Matcher matcher = VALID_IP_ADDRESS_REGEX.matcher(ipaddress);
        logger.info("Verifying IP address "+ipaddress);
        return matcher.find();
    }
}
