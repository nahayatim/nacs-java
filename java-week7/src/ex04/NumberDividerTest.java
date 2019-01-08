package ex04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberDividerTest {

    NumberDivider numberDivider = new NumberDivider();

    @Test
    void spliteNumber() {

        List<Integer> integers = numberDivider.spliteNumber(4325);
        Assertions.assertEquals(Arrays.asList(4,3,2,5),integers);
    }
}