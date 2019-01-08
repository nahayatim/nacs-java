package exercises.ex05;

import java.util.List;

public class AmericanExpress extends CreditCard {

    public AmericanExpress(String name, List<Integer> expectedLength, List<String> expectedStartWith) {
        super(name, expectedLength, expectedStartWith);
    }
}
