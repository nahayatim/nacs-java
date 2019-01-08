package ex01;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MoneyCalculatorTest {

    private MoneyCalculator moneyCalculator = new MoneyCalculator();

    @Test
    void testCalculateMoney(){
        List<Integer>payments = Arrays.asList(5, 2, 5, 1, 3, 4, 3, 2, 4, 4);
       int sum = moneyCalculator.calculateMoney(payments);
        Assertions.assertEquals(33,sum);
    }
}