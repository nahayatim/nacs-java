package ex01;

import java.util.List;

public class MoneyApplication {
    public static void main(String[] args) {

        MoneyCollector moneyCollector = new MoneyCollector();
        List<Integer> collectMoney = moneyCollector.collectMoney();
        System.out.println("money collected from each friend: "+collectMoney);


        MoneyCalculator moneyCalculator = new MoneyCalculator();
        Integer sum = moneyCalculator.calculateMoney(collectMoney);
        System.out.println("accumulated value: "+ sum);
    }
}
