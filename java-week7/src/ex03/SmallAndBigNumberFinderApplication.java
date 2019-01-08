package ex03;

import java.util.Arrays;
import java.util.List;

public class SmallAndBigNumberFinderApplication {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,5,6,7,8,1);
        SmallAndBigNumberFinder smallAndBigNumberFinder = new SmallAndBigNumberFinder();
        Integer biggestNumber = smallAndBigNumberFinder.findBiggestNumber(numbers);
        Integer smallestNumber = smallAndBigNumberFinder.findSmallestNumber(numbers);
        System.out.println("biggestNumber : "+biggestNumber);
        System.out.println("smallestNumber : "+smallestNumber);
    }
}
