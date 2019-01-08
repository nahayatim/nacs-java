package exercises.ex03;

public abstract class CoffeeMaker {


    //It has the getName abstract method that returns a String.

    protected abstract String getName();

   //It has the getBrewingTime abstract method that returns an Integer.
    protected abstract Integer getBrewingTime();


    //It has the brew method that returns a Coffee . It uses the getName and
    //getBrewingTime methods to create a Coffee and returns it.

    public  Coffee brew(){
        //it was my way
       // Coffee coffee = new Coffee(getName(),getBrewingTime());
        //return coffee;
        String madeBy = getName();
        Integer brewingTime = getBrewingTime();
        return new Coffee(madeBy,brewingTime);

    }
}
