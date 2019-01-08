package exercises.ex05;

import java.util.Arrays;
import java.util.List;

public class Cards {

    public static List<CreditCard> getCards(){
        return Arrays.asList(
                new AmericanExpress("AMERICAN EXPRESS",Arrays.asList(15),Arrays.asList("34","37")),
                new MasterCard("MASTER CARD",Arrays.asList(16),Arrays.asList("51","52","53","54","55")),
                new VisaCard("VISA CARD",Arrays.asList(13,16),Arrays.asList("4"))

        );
    }
}
