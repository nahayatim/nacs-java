package exercises.ex05;

import java.util.ArrayList;
import java.util.List;

public  abstract class CreditCard {

    private String name;
    private List<Integer> expectedLength;
    private List<String> expectedStartWith;

    public CreditCard(String name, List<Integer> expectedLength,
                      List<String> expectedStartWith) {
        this.name = name;
        this.expectedLength = expectedLength;
        this.expectedStartWith = expectedStartWith;
    }

    public Boolean validation(String cardNumber) {

        List<Boolean> validationList = new ArrayList<>();

        // length validation
        Integer cardNumberLength = cardNumber.length();
        if (!expectedLength.contains(cardNumberLength)) {
            return false;
        }

        //StartWith validation
        for (String cardPrefix : expectedStartWith) {
            if (cardNumber.startsWith(cardPrefix)) {
                return true;
            }
        }

        return false;
    }

    public String getName() {
        return name;
    }
}

