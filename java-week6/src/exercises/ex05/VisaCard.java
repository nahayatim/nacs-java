package exercises.ex05;

import java.util.List;

public class VisaCard extends CreditCard {

    public VisaCard(String name, List<Integer> expectedLength, List<String> expectedStartWith) {
        super(name, expectedLength, expectedStartWith);
    }
}
