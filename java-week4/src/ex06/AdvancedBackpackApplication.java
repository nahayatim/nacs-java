package ex06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AdvancedBackpackApplication {

    public static void main(String[] args) {

        // Create an empty backpack set of Item and display it.
        Set<Item> backpack = new HashSet<>();
        System.out.println("Backpack: "+backpack);

        //Create three different Item objects.
        Item toothpaste = new Item("toothpaste");
        Item towel = new Item("towel");
        Item underwear = new Item("underwear");

        //Add them to the backpack set and display it. To display the Item class
        //create the toString method.
        backpack.add(toothpaste);
        backpack.add(towel);
        backpack.add(underwear);
        System.out.println("Backpack: "+backpack);

        //Create a new Item with the same name as a previous one and use it to
        //ask if is contained in the set and display the answer. To compare an
        //Item automatically you need to create the equals method in the Item
        //class. Specify that two Items are the same if their name is the same.
        Item anotherToothpaste= new Item("toothpaste");
        if (backpack.contains(anotherToothpaste)){
            System.out.println("The backpack contains "+anotherToothpaste);
        }

        //Use the last Item you created to remove the original one from the set.
        //To remove an Item automatically you need to create the equals method
        //in the Item class.
        backpack.remove(anotherToothpaste);
        System.out.println("Backpack: "+backpack);

        //Ask if the element you just removed is not contained in the set and
        //display the answer.
        if (!backpack.contains("toothpaste")){
            System.out.println("The backpack no longer contains "+anotherToothpaste);
        }

        //Add one of the existing items twice and display the set.
        backpack.add(towel);
        backpack.add(towel);
        System.out.println("Backpack: "+backpack);

        //Display its size.
        System.out.println("backpack size: "+ backpack.size());

    }
}
