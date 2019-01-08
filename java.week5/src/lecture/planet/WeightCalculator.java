package lecture.planet;

import java.util.List;
import java.util.Optional;

public class WeightCalculator {

    private List<Planet> planets = Planets.asList();

    public void displayInAllPlanets(Double weight) {
        for (Planet planet : planets) {
            display(weight, planet);
        }
    }

    private void display(Double weight, Planet planet) {
        String name = planet.getName();
        Double newWeight = planet.weight(weight);
        System.out.println("your weight in "+name+ " is "+newWeight+" kg");
    }


    }

