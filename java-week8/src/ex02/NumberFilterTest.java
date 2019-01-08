package ex02;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class NumberFilterTest {

    NumberFilter numberFilter = new NumberFilter();

    @Test
    void testGetEven(){
        List<Integer>numbers = Arrays.asList(2,3,5,8,9);

        List<Integer> expected = Arrays.asList(2,8);
        List<Integer>actual = numberFilter.getEven(numbers);

        Assertions.assertEquals(expected,actual);

    }


}