package ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdvancedShoppingApplication {
    public static void main(String[] args) {

        //Create an empty groceries list of Grocery and display it.
        List<Grocery>groceries = new ArrayList<>();
        System.out.println("Groceries: "+groceries);

        //Create three different Grocery objects.
        Grocery bananas = new Grocery("bananas");
        Grocery oranges = new Grocery("oranges");
        Grocery tomatoes = new Grocery("tomatoes");

        //Add them to the groceries list and display it. To display the Grocery
        //class create the toString method.
        groceries.add(bananas);
        groceries.add(oranges);
        groceries.add(tomatoes);
        System.out.println("Groceries: "+groceries);

        // Create a new Grocery with the same name as a previous one and use
        //it to remove the original one from the list. To remove a Grocery
        //automatically you need to create the equals method in the Grocery
        //class. Specify that two Grocery are the same if their name is the
        //same.
        Grocery otherOranges = new Grocery("oranges");
        groceries.remove(otherOranges);
        System.out.println("Groceries: "+groceries);

        //Add one of the existing groceries twice and display the list.
        groceries.add(tomatoes);
        groceries.add(tomatoes);
        System.out.println("Groceries: "+ groceries);

        //Remove the third element of the list by providing its position and
        //display it.
        groceries.remove(2);
        System.out.println("Groceries: "+groceries);

        //Display its size.
        System.out.println("Groceries size: "+ groceries.size());
    }
}



