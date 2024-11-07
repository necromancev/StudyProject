import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.romantsev.Assigment467.*;

public class CalculatorTest {

    static Calculator calculator;
    Operation operation;
    DividingByZeroException exception;

    @BeforeClass
    public static void initialize() {
        calculator = new Calculator();
    }

    @Test
    public void additionReturnsPositiveNumber(){
        operation = new Addition();
        calculator.setOperation(operation);
        float result = calculator.printResults(34.23F, 45.220F);
        Assert.assertEquals(79.4500F,result,0);
    }


    @Test
    public void substractionReturnsPositiveNumber(){
        operation = new Substraction();
        calculator.setOperation(operation);
        float result = calculator.printResults(78.11F, 43.34F);
        Assert.assertEquals(34.77F,result,0);
    }

    @Test
    public void substractionReturnsNegativeNumber(){
        operation = new Substraction();
        calculator.setOperation(operation);
        float result = calculator.printResults(78.11F, 123.34F);
        Assert.assertEquals(-45.229996F,result,0);
    }

    @Test
    public void multiplicationReturnsPositiveNumber(){
        operation = new Multiplication();
        calculator.setOperation(operation);
        float result = calculator.printResults(11F, 22.34F);
        Assert.assertEquals(245.74F,result,0);
    }

    @Test
    public void divisionReturnsPositiveNumber(){
        operation = new Division();
        calculator.setOperation(operation);
        float result = calculator.printResults(99, 33);
        Assert.assertEquals(3F,result,0);
    }

    @Test()
    public void divisionByZeroThrowsException(){
        boolean thrown = false;
        try {
            operation = new Division();
            calculator.setOperation(operation);
            float result = calculator.printResults(99, 0);
        } catch (DividingByZeroException e) {
            thrown = true;
        }
        Assert.assertTrue(thrown);
    }
}
