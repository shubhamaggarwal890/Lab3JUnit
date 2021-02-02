import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        EmailAddressTest.class,
        IPAddressTest.class,
        ArrayBasedTest.class
})
public class TestSuites {
    // the class remains empty
    // used only as a holder for the above annotations
}
