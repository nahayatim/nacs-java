import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class NumberTransformator {

    public List<Integer> transform(List<Integer> numbers, Function<Integer, Integer> calculation) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            Integer transformed = calculation.apply(number);
            result.add(transformed);
        }
        return result;
    }
}
