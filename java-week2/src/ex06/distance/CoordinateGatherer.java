package ex06.distance;

import java.util.Scanner;

//is responsible of gathering the coordinates of one point


public class CoordinateGatherer {

    private Scanner scanner = new Scanner(System.in);

    public Coordinate gather(){
        System.out.println("Write the latitude of the coordinate: ");
        double latitude = scanner.nextDouble();
        System.out.println("Write the longitude of the coordinate: ");
        double longitude = scanner.nextDouble();
        return new Coordinate(latitude,longitude);
    }

}
