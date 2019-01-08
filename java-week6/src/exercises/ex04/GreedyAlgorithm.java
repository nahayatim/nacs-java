package exercises.ex04;

import java.util.ArrayList;
import java.util.List;

public class GreedyAlgorithm extends Money {

    public GreedyAlgorithm(Integer amount) {
        super(amount);
    }

    public List<Money> change(Integer amount) {
        List<Money> coinsList = Coins.getCoinsList();
        //   for (Money money : coinsList) {
        //     System.out.println(money.getAmount());
        //  }
        List<Money> changeList = new ArrayList<>();
        for (Money coin : coinsList) {
            //   System.out.println("amount = "+coin.getAmount());
            if (isApplicable(amount)) {
                Integer numberOfCoins = amount / coin.getAmount();
                changeList.add(new GreedyAlgorithm(numberOfCoins));
                amount = amount % coin.getAmount();
            }
            // System.out.println("change list = " + changeList);
        }
        //System.out.println(changeList);
        return changeList;

    }


}
