package ex02;

import java.util.HashSet;
import java.util.Set;

public class BasicBackpackApplication {

    public static void main(String[] args) {

        Set<String>items=new HashSet<>();
        display("An empty backpack:",items);

        //-----------------------------------------------------------

        String item1= "bag";
        String item2= "shoes";
        String item3= "jeans";

        items.add(item1);
        items.add(item2);
        items.add(item3);
        display("creat and add 3 item to backpack:",items);

        //------------------------------------------------------------------

        boolean contains = items.contains(item1);
        System.out.println("Is item1 is in items?"+ contains);

        //-----------------------------------------------------------------

        items.remove(item1);
        display("items after removing item1:",items);

        //------------------------------------------------------------------

        boolean isContain=items.contains(item1);
        System.out.println("Is item1 in items?"+ isContain);

        //________________________________________________________________

        items.add(item1);
        items.add(item1);
        display("add one item twice",items);

        //_________________________________________________________________

        int size = items.size();
        System.out.println("The size of items:"+ size);


    }

    private static void display(String message,Set<String> items) {
        System.out.println(message);
        System.out.println(items);
    }
}
   // Hansel is preparing himself for a trip and wants to make sure he has packed at least one of everything.
     //   Create the BasicBackpackApplication class and write the following instructions in its main method:
       // Create an empty backpack set and display it.
        //Create three Strings that represent three different items.
        //Add them to the backpack set and display it.
        //Ask if one of them is contained in the set and display the answer.
        //Remove one of them by providing its name as an argument and display the set.
        //Ask if the element you just removed is not contained in the set and display the answer.
        //Add one of the existing items twice and display the set.
        //Display its size.
