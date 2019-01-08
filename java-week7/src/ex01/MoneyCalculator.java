package ex01;

//receives money numbers and returns the accumulated value.


import java.util.Arrays;
import java.util.List;

public class MoneyCalculator {

    public Integer calculateMoney(List<Integer>payments){
        int sum = 0;
        for (Integer payment : payments) {
            sum = sum + payment;
        }
        return sum;
    }

}
