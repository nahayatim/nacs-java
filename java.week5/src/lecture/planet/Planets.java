package lecture.planet;

import java.util.Arrays;
import java.util.List;

public class Planets {

    private static List<Planet> planets = Arrays.asList(
            new Venus(), new Mars(), new Earth());

    public static List<Planet> asList() {
        return planets;
    }
}
