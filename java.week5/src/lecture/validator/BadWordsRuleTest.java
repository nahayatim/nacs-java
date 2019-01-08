package lecture.validator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BadWordsRuleTest {

    private BadWordsRule rule = new BadWordsRule();

    @Test
    void testNoBadWord() {
        String text = "potato potato";
        boolean result = rule.isOk(text);
        Assertions.assertTrue(result);
    }

    @Test
    void testOneBadWord(){
        String text = "potato potato shit";
        boolean result = rule.isOk(text);
        Assertions.assertFalse(result);
    }

    @Test
    void testAnotherBadWord(){
        String text = "potato potato, damn potato";
        boolean result = rule.isOk(text);
        Assertions.assertFalse(result);
    }

    @Test
    void testTwoBadWord(){
        String text = "potato potato, damn potato shit";
        boolean result = rule.isOk(text);
        Assertions.assertFalse(result);
    }
}