package ex09;

import java.util.List;

public class LoremIpsumApplication {
    public static void main(String[] args) {

        //create a FileReader, read all the lines of the lorem-ipsum.txt
        //file and display them.


        FileReader reader= new FileReader();

        System.out.println("---- TEXT");
        List<String> lines = reader.asLines("ex09/lorem-ipsum");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
