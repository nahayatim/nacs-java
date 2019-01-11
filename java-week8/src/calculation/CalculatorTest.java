package calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator= new Calculator();

    @Test
    void calculate() {
        Integer result = calculator.calculate(6, number -> number + 2);
        Assertions.assertEquals(8,result);
    }
}