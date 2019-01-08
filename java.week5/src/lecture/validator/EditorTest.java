package lecture.validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class EditorTest {

    @Test
    void  testIsNotOk(){
        HashSet<Rule> rules = getRules();
        Editor editor = new Editor(rules);

        String evaluation = editor.evaluate("no shit!");
        //System.out.println(evaluation);
        Assertions.assertEquals("Not ok",evaluation);
    }

    private static HashSet<Rule> getRules() {

        HashSet<Rule> rules = new HashSet<>();
        rules.add(new LengthRule());
        rules.add(new BadWordsRule());
        return rules;
    }

}