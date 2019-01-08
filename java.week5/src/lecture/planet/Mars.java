package lecture.planet;

public class Mars implements Planet {
    @Override
    public String getName() {
        return "Mars";
    }

    @Override
    public Double weight(Double weight) {
        return weight* 0.38;
    }
}
