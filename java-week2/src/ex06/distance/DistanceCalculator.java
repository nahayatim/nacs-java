package ex06.distance;

//The distance between two points [ (x1,y1) & (x2,y2)] is
// distance = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//The radius of the earth is radius = 6371.01 Kilometers



public class DistanceCalculator {



    public Double calculateDistance(Coordinate cordinate1, Coordinate cordinate2){
        Double x1 = cordinate1.getLatitude();
        Double y1 = cordinate1.getLongitute();
        Double x2 = cordinate2.getLatitude();
        Double y2 = cordinate2.getLongitute();
        Double radiusOfTheEarth = 6371.01;
        double sin = Math.sin(x1) * Math.sin(x2);
        double cos = Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2);
        double acos = Math.acos(sin + cos);
        return radiusOfTheEarth * acos;
    }
}
