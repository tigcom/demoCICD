package fpoly;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class CalculatorTestNG {
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
    public void testDivide() {
        System.out.println("Test phép chia");
        assertEquals(calculator.divide(6, 3), 2);
    }
}
