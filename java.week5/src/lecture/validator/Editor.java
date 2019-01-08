package lecture.validator;

import java.util.Set;

public class Editor {

    private Set<Rule> rules;

    public Editor(Set<Rule> rules) {
        this.rules = rules;
    }

    public String evaluate(String text){
        for (Rule rule : rules) {
            if (!rule.isOk(text)){
                return "Not ok";
            }
        }
        return "ok";

    }
}
