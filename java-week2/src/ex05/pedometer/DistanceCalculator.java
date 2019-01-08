package ex05.pedometer;

//has a calculateDistance method that receives a number of steps
// as Double and returns the distance in kilometers as Double.
//One step is considered to be exactly 0.000762 kilometers.


public class DistanceCalculator {

    public Double calculateDistance(Double numberOfSteps){
        Double kilometersPerStep = 0.000762;
        return numberOfSteps * kilometersPerStep;

    }
}
