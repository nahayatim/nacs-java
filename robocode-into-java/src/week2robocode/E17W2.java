package week2robocode;

import java.util.ArrayList;
import java.util.List;

public class E17W2 {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("PLEASE");
        words.add("NO");
        words.add("ADVERTISEMENT");
        words.replaceAll(String::toLowerCase);

        System.out.println(words);


        //String str = "PLEASE NO ADVERTISEMENT";
       // System.out.println(str.toLowerCase());

       // List<String> words = Arrays.asList("PLEASE", "NO", "ADVERTISEMENT" );
       // System.out.println(words);

        //List<String> WORDS = Arrays.asList("");
      //  System.out.println(WORDS);




    }

   /* private static List<String> getCollection(){
        List<String> words= new ArrayList<>();
        words.add("PLEASE");
        words.add("NO");
        words.add("ADVERTISEMENT");
        return words;*/
    }

