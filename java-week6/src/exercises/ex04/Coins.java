package exercises.ex04;

import java.util.Arrays;
import java.util.List;

public class Coins {

    public static List<Money> coinsList= Arrays.asList(
            new Cent50(50),
            new Cent20(20),
            new Cent10(10),
            new Cent5(5),
            new Cent2(2),
            new Cent1(1)
    );

    public static List<Money> getCoinsList(){
        return coinsList;
    }

}
