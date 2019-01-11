import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberTransformatorTest {

    private NumberTransformator transformator = new NumberTransformator();

    @Test
    void transformMultiplication() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = transformator.transform(numbers, n -> n * 10);

        List<Integer> expected = Arrays.asList(10, 20, 30, 40, 50);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void transformAddition() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = transformator.transform(numbers, n -> n + 10);

        List<Integer> expected = Arrays.asList(11, 12, 13, 14, 15);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void cleverListTransform(){
        List<Integer>numbers =Arrays.asList(1,2,3);
        numbers.replaceAll(n->n+2);

        List<Integer>expected =Arrays.asList(3,4,5);
        Assertions.assertEquals(expected,numbers);


    }
}