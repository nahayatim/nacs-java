package exercises.ex04;

//Create the Money abstract class that will represent one single cent coin.
//Design this class with the help of attributes, methods or abstract methods,
//so that at least it can tell its amount as Integer and whether it is applicable
//for an Integer amount.

public abstract class Money {

    private Integer amount;

    public Money(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public Boolean isApplicable(Integer coin){
        return amount>=coin;
    }
}
