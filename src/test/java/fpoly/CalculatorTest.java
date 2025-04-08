package fpoly;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class CalculatorTest {
    Calculator calculator;

    @BeforeClass
    public void setupBeforeAll() {
        calculator = new Calculator();
    }
    @Test
    public void testAdd() {
        System.out.println("Test phép cộng");
        assertEquals(calculator.add(2, 3), 5);
    }

    @Test
    public void testsubtract() {
        System.out.println("Test phép trừ");
        assertEquals(calculator.subtract(5, 3), 2);
    }
}
