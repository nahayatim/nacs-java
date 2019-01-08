package reflection6;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

//The Cars class has the getNextCar method that receives a brand and creates a random automatic or
//manual car to return it as a Car.

public class Cars {


    public static Car getNextCar(String brand){
        Random random = new Random();
        boolean isAutomatic = random.nextBoolean();
        if (isAutomatic){
            return new AutomaticCar(brand);
        }
        return new ManualCar(brand);
    }

}
