package lecture.validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class LengthRuleTest {

    private LengthRule rule = new LengthRule();

    @Test
    void testIsSmaller(){
        String text = "potato";
        boolean result = rule.isOk(text);
        Assertions.assertTrue(result);
    }

     @Test
    void testIsEquals(){
        String text = "0123456789";
        boolean result = rule.isOk(text);
        Assertions.assertTrue(result);
    }

   @Test
    void testIsBigger(){
        String text = "0123456789a";
        boolean result = rule.isOk(text);
        Assertions.assertFalse(result);
    }



}