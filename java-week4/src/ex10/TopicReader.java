package ex10;

import ex07.Topic;

import java.util.ArrayList;
import java.util.List;

public class TopicReader {

    //has a FileReader as an attribute. It has the getTopics method that
    //uses the File Reader to read the topics.txt file, transform every
    //line into one Topic and returns the list of topics.
    private FileReader reader = new FileReader();

    public List<Topic> asList(){
        List<String> lines = readAllLines();
        List<Topic> topics = parseTopics(lines);
        return topics;
    }


    private List<String> readAllLines() {
        return reader.asLines("ex10/topics.txt");
    }

    private List<Topic> parseTopics(List<String> lines) {

        List<Topic> topics = new ArrayList<>();
        for (String line : lines) {
            topics.add(new Topic(line));

        }
       return topics;
    }
}
