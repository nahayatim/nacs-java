package ex06.distance;

public class DistanceApplication {
    public static void main(String[] args) {
        CoordinateGatherer gatherer = new CoordinateGatherer();
        Coordinate coordinate1 = gatherer.gather();
        Coordinate coordinate2 = gatherer.gather();
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        System.out.println("Calculating ...");
        Double distance = distanceCalculator.calculateDistance(coordinate1, coordinate2);
        System.out.println("The distance between those points is: " + distance+ " km");

    }
}
