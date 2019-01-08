package ex01.hikingday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//hat has a list of hikers as attribute. It has the signUp method that gathers
// the hikers. It has the method showHikers method that displays the hikers.


public class Hike {

    private Gatherer gatherer = new Gatherer();

    private List<Hiker> hikers = new ArrayList<>();

    public void signUp(){
        hikers = gatherer.signUp();
    }


    public void showHikers(){
        for (Hiker hiker : hikers) {
            System.out.println("Hiker: "+hiker.getName());
        }

    }
}
