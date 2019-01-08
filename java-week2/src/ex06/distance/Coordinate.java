package ex06.distance;

 //represents one coordinate (latitude and longitude)


public class Coordinate {

    private Double latitude;
    private Double longitute;

    public Coordinate(Double latitude, Double longitute) {
        this.latitude = latitude;
        this.longitute = longitute;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitute() {
        return longitute;
    }
}
