package ex07.sumofprime;

 //is responsible for providing a list of the first 550 Integer numbers.
//This method has a default visibility and should not be possible to use
//it from the main method.


import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {

    List<Integer>generateFirst550(){
        List<Integer>numbers = new ArrayList<>();
        for (int times = 0 ; times<550 ; times++) {
            numbers.add(times);

        }
        return numbers;
    }

}
