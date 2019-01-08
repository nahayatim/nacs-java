package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberFilter {

    public  List<Integer> getEven(List<Integer>numbers){
        List<Integer>even= new ArrayList<>();
        Predicate<Integer> condition = number-> (number%2)==0;
        for (Integer number : numbers) {
            if (condition.test(number)){
                even.add(number);
            }
        }
        return even;
    }
    public  List<Integer> getOdd(List<Integer>numbers){
        List<Integer>odd = new ArrayList<>();
        Predicate<Integer> condition = number-> (number%2)==1;
        for (Integer number : numbers) {
            if (condition.test(number)){
                odd.add(number);
            }
        }
        return odd;
    }
}

