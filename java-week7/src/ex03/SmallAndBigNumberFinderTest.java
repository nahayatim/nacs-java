package ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SmallAndBigNumberFinderTest {
    SmallAndBigNumberFinder smallAndBigNumberFinder = new SmallAndBigNumberFinder();
    List<Integer> numbers = Arrays.asList(3,5,7,8);

    @Test
    void findSmallestNumber() {

        int smallestNumber = smallAndBigNumberFinder.findSmallestNumber(numbers);
        Assertions.assertEquals(3,smallestNumber);

    }

    @Test
    void findBiggestNumber() {
        int biggestNumber = smallAndBigNumberFinder.findBiggestNumber(numbers);
        Assertions.assertEquals(8,biggestNumber);
    }
}