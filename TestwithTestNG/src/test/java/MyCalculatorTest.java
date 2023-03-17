import org.testng.Assert;
import org.testng.annotations.Test;

public class MyCalculatorTest {
    @Test
    void testAddMethod(){
        int fValue = 20, sValue = 60;
        int expectedValue = fValue + sValue;
        int actualResult = MyCalculator.add(fValue,sValue);
        Assert.assertEquals(expectedValue,actualResult);
    }
}
