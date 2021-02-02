import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Random;

public class ArrayBasedTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void emptyArrayList() {
        System.out.println(new ArrayList<Object>().get(2));
    }

    @Test
    public void arithmeticTest(){
        Random random = new Random();
        int random_num = random.nextInt(100);
        System.out.println(random_num);
        try{
            if(random_num<33){
                double result = 50/0;
            }else if(random_num<66){
                System.out.println(new ArrayList<Object>().get(2));
            }else{
                String a = null;
                System.out.println(a.charAt(0));
            }
            fail();

        }catch (ArithmeticException exception){
            assertEquals("/ by zero", exception.getMessage());
        }catch (IndexOutOfBoundsException exception) {
            assertEquals("Index: 2, Size: 0", exception.getMessage());
        }catch (NullPointerException exception){
            assertNull(exception.getMessage());
        }
    }
}
