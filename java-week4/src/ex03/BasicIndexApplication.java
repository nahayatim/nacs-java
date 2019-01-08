package ex03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BasicIndexApplication {
    public static void main(String[] args) {

        //Create an empty index map connecting Integers for the page
        // numbers and Strings for the book topics and display it.
        Map<Integer,String>index = new HashMap<>();
        System.out.println(index);

        //Create three Integers that represent three different page
        // numbers.
        Integer one = 1;
        Integer two = 2;
        Integer three = 3;

        //Create three Strings that represent three different book topics.
        String topic1 = "connecting";
        String topic2 = "positive things";
        String topic3 = "ecologic economy";

        //Put them into the index map from biggest to smallest page
        //number and display it to notice that the entries are automatically
        //arranged.
        index.put(one,topic1);
        index.put(two,topic2);
        index.put(three,topic3);
        System.out.println("Index: "+index);

        //Display the map keys.
        System.out.println("Index keys: "+index.keySet());

        //Display the map values.
        System.out.println("Index values: "+index.values());

        System.out.println("Index entry sets: " + index.entrySet());


        //Create one String representing another book topic.
        String topic4 = "teaching methods";

        //Put this new topic into the same page number than an existing one
        //and display the map to notice that the previous one is replaced.
        index.put(three,topic4);
        System.out.println("Index: "+index);

        //Ask if one of the keys is contained in the map and display the answer.
        if (index.containsKey(one)){
            System.out.println("The page number"+ one+ " exist as key.");
        }

        //Get one of them by providing its name as an argument and display it.
        System.out.println("The topic in page number "+three+" is "+index.get(three));

        // Display its size.
        System.out.println("Index size: "+index.size());



    }

}


