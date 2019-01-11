package ex02;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class NumberFilterTest {

    private NumberFilter filter = new NumberFilter();
    private List<Integer> numbers = Arrays.asList(2, 4, 6, 7, 8, 9);


    @Test
    void testGetEven() {
        Predicate<Integer> condition = number -> (number % 2) == 0;

        List<Integer> even = filter.filterNumber(numbers, condition);
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);
        Assertions.assertEquals(expected, even);

        condition = number -> (number % 2) == 1;

        List<Integer>odd = filter.filterNumber(numbers, condition);
        expected = Arrays.asList(7, 9);
        Assertions.assertEquals(expected, odd);
    }
}