package lecture.validator;

import java.util.Arrays;
import java.util.List;

public class BadWordsRule implements Rule {

    private List<String> badWords = Arrays.asList("damn","shit");

    @Override
    public boolean isOk(String text) {
        for (String badWord : badWords) {
            if (text.contains(badWord)){
                return false;
            }
        }
        return true;
    }
}
