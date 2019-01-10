package ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {

    public List<String> findElegant(String sentence) {
        return filter(sentence, e -> e.startsWith("ele"));
    }


    public List<String> findPlayful(String sentence) {
        return filter(sentence, e -> e.endsWith("ful"));
    }


    private List<String> filter(String sentence, Predicate<String> condition) {

        List<String> foundedWords = new ArrayList<>();
        String[] splited = sentence.split(" ");
        List<String> words = Arrays.asList(splited);
        for (String word : words) {
            if (condition.test(word)) {
                foundedWords.add(word);
            }
        }
        return foundedWords;


    }


}
