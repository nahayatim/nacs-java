package ex03;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SmallAndBigNumberFinder {

    public Integer findSmallestNumber(List<Integer> numbers){



        Collections.sort(numbers);
        Integer smallestNumber = numbers.get(0);
        return smallestNumber;
    }


    public Integer findBiggestNumber(List<Integer>numbers){
        Collections.sort(numbers);
        int size = numbers.size();
        Integer biggestNumber = numbers.get(size - 1);
        return biggestNumber;
    }





}
