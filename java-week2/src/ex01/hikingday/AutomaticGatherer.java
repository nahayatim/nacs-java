package ex01.hikingday;

import java.util.ArrayList;
import java.util.List;

// has a getConfirmedHikers method that provides a predefined list of five hikers.
// This method has a default visibility so that only the Gatherer class can use it.


public class AutomaticGatherer {

    List<Hiker> getConfirmedHikers(){
        List<Hiker>hikers = new ArrayList<>();
        hikers.add(new Hiker("lola"));
        hikers.add(new Hiker("Tom"));
        hikers.add(new Hiker("Peter"));
        hikers.add(new Hiker("Maria"));
        hikers.add(new Hiker("Samanta"));
        return hikers;
    }
}
