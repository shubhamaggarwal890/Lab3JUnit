import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    // fields used together with @Parameter must be public
    @Parameter(0)
    public int a; // 1

    @Parameter(1)
    public int b; // 2

    @Parameter(2)
    public int result; // 2

    @Parameters
    public static Collection<Object[]> data(){
        Object[][] data = new Object[][] {{1,2,2}, {2,5,10}, {0, 10, 0}};
        return Arrays.asList(data);
    }

    @Test
    public void multiplicationTesting() {
        Multiplication multiplication = new Multiplication();
        Assert.assertEquals("Multiplication", result, multiplication.multiply(a, b));

    }
}
