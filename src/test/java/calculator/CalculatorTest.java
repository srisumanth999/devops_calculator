package calculator;

import org.junit.*;

public class CalculatorTest {
    
    private Calculator calculator;
    
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int a = 30;
        int b = 20;
        int expectedResult = 50;
        long result = calculator.add(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    
    @Test
    public void testSubtract() {
        int a = 20;
        int b = 20;
        int expectedResult = 0;
        long result = calculator.subtract(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    
    @Test
    public void testMultiply() {
        int a = 5;
        int b = 2;
        long expectedResult = 10;
        long result = calculator.multiply(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    
    @Test
    public void testDivide() {
        int a = 66;
        int b = 10;
        double expectedResult = 6.6;
        double result = calculator.divide(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        int a = 20;
        int b = 0;
        calculator.divide(a, b);
    }
}
