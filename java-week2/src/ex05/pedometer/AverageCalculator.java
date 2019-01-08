package ex05.pedometer;

//has a calculateAverage method that receives a list of Integer and
// returns a Double that is the average.


import java.util.List;

public class AverageCalculator {

    public Double calculateAverage(List<Integer>stepsFromEveryone){
        Integer sum = 0;
        for (Integer step : stepsFromEveryone) {
            sum += step;
        }

        Double average = sum / new Double(stepsFromEveryone.size());
        return average;


    }

}
