package ex04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PowerLevelScouter {


    public Integer scout(String name) {
        return calculator(name, letter -> (int) letter.charAt(0));
    }

    public Integer scoutInhaced(String name) {
        return calculator(name, s -> (int) s.toLowerCase().charAt(0));
    }

    private Integer calculator(String name, Function<String, Integer> formula) {
        int powerlevel = 0;
        String[] splitedName = name.split("");
        //List<String> characters = Arrays.asList(splitedName);

        for (String character : splitedName) {
            int ascii = formula.apply(character);
            powerlevel += ascii;
        }

        return powerlevel;
    }

}
