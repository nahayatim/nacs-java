package lecture.planet;

import java.nio.file.Paths;

public class Earth implements Planet {
    @Override
    public String getName() {
        return "Earth";
    }

    @Override
    public Double weight(Double weight) {
        return weight;
    }
}
