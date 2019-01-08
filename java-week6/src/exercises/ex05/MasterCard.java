package exercises.ex05;

import java.util.List;

public class MasterCard extends CreditCard {

    public MasterCard(String name, List<Integer> expectedLength, List<String> expectedStartWith) {
        super(name, expectedLength, expectedStartWith);
    }
}
