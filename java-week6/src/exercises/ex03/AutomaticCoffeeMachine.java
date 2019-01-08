package exercises.ex03;

public class AutomaticCoffeeMachine extends CoffeeMaker {



    @Override
    protected String getName() {
        return "Automatic coffee machine" ;
    }

    @Override
    protected Integer getBrewingTime() {
        return 5;
    }
}
