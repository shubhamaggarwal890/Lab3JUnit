import org.junit.*;

import static org.junit.Assert.*;

public class EmailAddressTest {

    @BeforeClass
    public static void beforeEmailClass(){
        System.out.println("Before Email Class Testing");
    }

    @Before
    public void beforeEmailTest(){
        System.out.println("Before Email Testing");
    }

    @Test
    @Ignore("Because I want to")
    public void trueNegativeEmailAddressVerifyWithNoDomain() {
        EmailAddress address = new EmailAddress();
        System.out.println("Testing for shubham@iiitb");
        assertEquals(address.verifyEmailAddress("shubham@iiitb"), false);
    }

    @Test
    public void trueNegativeEmailAddressVerifyWithNoSignature() {
        EmailAddress address = new EmailAddress();
        System.out.println("Testing for shubham#iiitb.com");
        assertFalse(address.verifyEmailAddress("shubham#iiitb.com"));
    }

    @Test
    public void trueNegativeEmailAddressVerifyWithUnusualUser() {
        EmailAddress address = new EmailAddress();
        System.out.println("Testing for shubham#123@iiitb.com");
        assertNotEquals("Email address doesn't seems to be right", address.verifyEmailAddress("shubham#123@iiitb.com"), true);
    }

    @After
    public void afterEmailTest(){
        System.out.println("After Email Testing");
    }

    @AfterClass
    public static void afterEmailClass(){
        System.out.println("After Email Class Testing");
    }


}
