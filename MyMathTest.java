import org.testng.Assert;
import org.testng.annotations.Test;

public class MyMathTest {

    @Test
    public void testSum(){
        int result = MyMath1.sum(2,2);

        Assert.assertEquals(result, 4);
    }
}
