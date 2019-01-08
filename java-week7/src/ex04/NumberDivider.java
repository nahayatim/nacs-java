package ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberDivider {

    public List<Integer> spliteNumber(Integer number){

        String Number =number.toString();
        String[] split = Number.split("");
        List<String> numbers = Arrays.asList(split);
        List<Integer>Numbers = new ArrayList<>();
        for (String s : numbers) {
            Integer integer = Integer.valueOf(s);
            Numbers.add(integer);

        }
        return Numbers;

    }


}
