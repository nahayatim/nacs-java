package ex10;

//create a TopicReader, use the getTopics method and place them inside
//a list. Display the list of topics. Create a set of Topic, add the
//elements of the previous list and display it to notice that there
//happens to be duplicates. To ensure uniqueness you have to create the
//equals method in the Topic class. Do this and run the program again to
//make sure the set does not display any duplicates.

import ex07.Topic;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TopicReaderApplication {
    public static void main(String[] args) {

        TopicReader reader = new TopicReader();

        List<Topic> topics = reader.asList();
        for (Topic topic : topics) {
            System.out.println("Topic list: "+topic);
        }

        Set<Topic>topicSet = new HashSet<>(topics);
        for (Topic topic : topicSet) {
            System.out.println("Topic set: "+topic);

        }
    }
}
