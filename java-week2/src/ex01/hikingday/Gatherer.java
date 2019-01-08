package ex01.hikingday;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// has a signUp method that asks for hiker’s names indefinitely until
// it receives an empty String and returns the list of hikers that
// signed up for the hike.


public class Gatherer {

    private Scanner scanner= new Scanner(System.in);
    private AutomaticGatherer automaticGatherer= new AutomaticGatherer();


    public List<Hiker> signUp(){
        List<Hiker> hikers = new ArrayList<>();
        hikers.addAll(automaticGatherer.getConfirmedHikers());

        String name = askForName();

        while (!name.isEmpty()){
            Hiker hiker = new Hiker(name);
            hikers.add(hiker);
            name = askForName();
        }
        return hikers;
    }

    private String askForName() {
        System.out.println("Write your name:");
        return scanner.nextLine();
    }
}
