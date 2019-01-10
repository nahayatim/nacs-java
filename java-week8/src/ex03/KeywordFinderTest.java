package ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KeywordFinderTest {

    private KeywordFinder finder = new KeywordFinder();

    @Test
    void findElegant() {
        String sentence = "The elephant is lifted eleven floors easily with the help of an electricity elevator";
        List<String> elegant = finder.findElegant(sentence);
        List<String> expected = Arrays.asList("elephant", "eleven", "electricity", "elevator");

        Assertions.assertEquals(expected, elegant);
    }

    @Test
    void findPlayful() {
        String sentence = "The rightful heir of the powerful king had an awful accident playing with a colorful bear";
        List<String> playful = finder.findPlayful(sentence);
        List<String> expexted = Arrays.asList("rightful", "powerful", "awful", "colorful");

        Assertions.assertEquals(expexted, playful);

    }
}