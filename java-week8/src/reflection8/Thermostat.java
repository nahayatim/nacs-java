package reflection8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {

    Predicate<Double>condition;
    Function<Double,String>display;

    public Thermostat(Predicate<Double> condition, Function<Double, String> calculation) {
        this.condition = condition;
        this.display = calculation;
    }

    public String sense(Double temperature){
        if (condition.test(temperature)){
            return "Warning";
        }
        return display.apply(temperature);
    }


}






