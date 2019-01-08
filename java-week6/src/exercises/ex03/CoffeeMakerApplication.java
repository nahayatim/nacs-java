package exercises.ex03;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Use the CoffeeMakers class to receive all available coffee makers as a list.
//For each one of them, brew a Coffee and display the madeBy and brewedTime
//from the Coffee.

public class CoffeeMakerApplication {

    private static List<String> names = Arrays.asList("Automatic coffee machine","French press","Auto drip","Moka pot");

    public static void main(String[] args) {

        List<CoffeeMaker> coffeeMakers = CoffeeMakers.asList();
        for (CoffeeMaker coffeeMaker : coffeeMakers) {
            System.out.println(coffeeMaker.brew().getMadeBy()+" brewed a coffee and it took "+ coffeeMaker.brew().getBrewedTime()+ " minutes.");
        }
        System.out.println("------------------");
        for (String name:names) {
            Optional<CoffeeMaker> coffeeMaker = CoffeeMakers.get(name);
            if(coffeeMaker.isPresent()){
                Coffee coffee = coffeeMaker.get().brew();
                System.out.println(coffee.getMadeBy()+" brewed a coffee and it took "+ coffee.getBrewedTime()+ " minutes.");
            }else{
                System.out.println("The coffee maker with the name "+ name + " is not available.");
            }

        }
    }
}




       /*my way: Optional<CoffeeMaker> automatic = CoffeeMakers.get("Automatic coffee machine");
        if (automatic.isPresent()) {
            Coffee coffee = automatic.get().brew();
            System.out.println(coffee.getMadeBy() + " brewed a coffee and it took "
                    + coffee.getBrewedTime() + " minutes");
        }


        Optional<CoffeeMaker> frenchPress = CoffeeMakers.get("French press");
        if (frenchPress.isPresent()) {
            Coffee coffee = frenchPress.get().brew();
            System.out.println(coffee.getMadeBy() + " brewed a coffee and it took " + coffee.getBrewedTime() + " minutes");
        }


        Optional<CoffeeMaker> autoDrip = CoffeeMakers.get("Auto drip");
        if (autoDrip.isPresent()) {
            Coffee coffee = autoDrip.get().brew();
            System.out.println(coffee.getMadeBy() + " brewed a coffee and it took " + coffee.getBrewedTime() + " minutes");
        }

        Optional<CoffeeMaker> mokka = CoffeeMakers.get("Mokka");
        if (!mokka.isPresent()) {
            System.out.println("The coffee maker with the name Mokka is not available");
        }
        else {
            Coffee coffee = mokka.get().brew();
            System.out.println(coffee.getMadeBy() + " brewed a coffee and it took " + coffee.getBrewedTime() + " minutes");

        }
    }*/


       // Use the CoffeeMakers class to get one maker that does not exist. Check with
        //the Optional that it is not present and display a message saying that this
        //particular coffee maker is not available.





