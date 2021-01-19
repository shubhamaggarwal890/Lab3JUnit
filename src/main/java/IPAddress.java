import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddress {

    public static final Pattern VALID_IP_ADDRESS_REGEX = Pattern.compile("\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}\b");

    boolean verifyIPAddress(String ipaddress){
        Matcher matcher = VALID_IP_ADDRESS_REGEX.matcher(ipaddress);
        return matcher.find();
    }
}
