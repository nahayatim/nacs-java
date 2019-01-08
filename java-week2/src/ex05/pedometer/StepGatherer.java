package ex05.pedometer;

//asks three times for the number of steps and returns a list
// with those three Integers.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StepGatherer {

    Scanner scanner = new Scanner(System.in);

    public List<Integer>gatherSteps(){

        List<Integer>stepsFromEveryone = new ArrayList<>();
        for (int times = 0 ; times<3 ; times++) {
            Integer steps = askForSteps();
            stepsFromEveryone.add(steps);

        }
        return stepsFromEveryone;
    }


    private Integer askForSteps() {

        System.out.println("How many steps did you count?");
        return scanner.nextInt();
    }

}
