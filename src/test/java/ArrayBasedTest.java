import org.junit.Test;

import java.util.ArrayList;

public class ArrayBasedTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void emptyArrayList() {
        System.out.println(new ArrayList<Object>().get(0));
    }
}
