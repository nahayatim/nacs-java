package ex07;

import java.util.*;

public class AdvancedIndexApplication {

    public static void main(String[] args) {

        //Create an empty index map connecting Integer for the page numbers
        //and a List of Topic for the several book topics that will appear in
        //each page and display it.
        Map<Integer, List<Topic>>index =new HashMap<>();
        System.out.println("Index: "+index);

        //Create two Integers that represent two different page numbers.
        Integer page1 = 1;
        Integer page2 = 2;

        //Create three Topic objects.
        Topic connecting = new Topic("connecting");
        Topic positive_things = new Topic("positive things");
        Topic ecologic_economy = new Topic("ecologic economy");

        //Create two lists: topics1 and topics2.
        List<Topic>topics1 = new ArrayList<>();
        List<Topic>topics2 = new ArrayList<>();

        //Add one Topic to topics1 and two into topics2.
        topics1.add(connecting);
        topics2.add(positive_things);
        topics2.add(ecologic_economy);

        //Put the page numbers and topics1 and topics2 respectively into the
        //index map .
        index.put(page1,topics1);
        index.put(page2,topics2);

        //Display the map keys. To display the Topic class create the toString
        //method.
        System.out.println("Index keys: "+index.keySet());

        //Display the map values. To display the Topic class create the
        //toString method.
        System.out.println("Index values: "+index.values());
        System.out.println("Index entry sets: " + index.entrySet());

        //Create another different Topic.
        Topic teaching_method = new Topic("teaching method");

        //Get the topics1 from the map and call it stored. Add to stored the
        //last Topic you created. Display the map.
        List<Topic> stored = index.get(page1);
        stored.add(teaching_method);
        System.out.println("Index: "+index);

        //Ask if one of the keys is contained in the map and display the answer.
        if (index.containsKey(page1)){
            System.out.println("The page number "+ page1+" exists as key");
        }

        //Get the topics2 from the map and call it stored2 and display it.
        List<Topic> stored2 = index.get(page2);
        System.out.println("The topics in page number2 are "+stored2);

        //Display its size.
        System.out.println("Index size: "+index.size());




    }

}
