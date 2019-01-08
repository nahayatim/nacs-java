package exercises.ex03;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakers {

    //It has the asList static method that returns the three CoffeeMakers as a list
    // of CoffeeMaker.
     public static  List <CoffeeMaker> asList() {
        return Arrays.asList(new AutomaticCoffeeMachine(),new AutoDrip(),new FrenchPress());
    }

    //It has the get static method that receives a String representing the name of the
    //coffee maker you want to receive, and it returns an Optional with the CoffeeMaker
    //you wanted if it found it within its list of available ones. Otherwise an empty
    //one.
    public static Optional<CoffeeMaker> get(String coffeemakerName){

         List<CoffeeMaker>coffeeMakers = asList();
        for (CoffeeMaker coffeeMaker : coffeeMakers) {
            if(coffeeMaker.getName().equalsIgnoreCase(coffeemakerName)){
                return Optional.of(coffeeMaker);
            }
        }
        return Optional.empty();
    }

}
