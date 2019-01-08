package exercises.ex05;

import java.util.List;

public class ValidationCheck {
    public String check(String cardNumber){
        LuhnAlgorithm luhnAlgorithm = new LuhnAlgorithm();
        Boolean validate = luhnAlgorithm.validate(cardNumber);

        if(!validate){
            return "INVALID";
        }

        List<CreditCard> cards = Cards.getCards();
        for (CreditCard card : cards) {
            if (card.validation(cardNumber)){
                return card.getName();
            }
        }
        return "INVALID";
    }
}
