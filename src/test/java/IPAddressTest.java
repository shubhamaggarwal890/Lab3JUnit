import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IPAddressTest {

    @Test
    public void trueNegativeIPAddressFirst8Bits() {
        IPAddress ipAddress = new IPAddress();
        assertFalse(ipAddress.verifyIPAddress("0.1.2.3"));
    }

    @Test
    public void trueNegativeIPAddressExtra8Bits() {
        IPAddress ipAddress = new IPAddress();
        assertFalse(ipAddress.verifyIPAddress("192.1.2.3.4"));
    }
}
