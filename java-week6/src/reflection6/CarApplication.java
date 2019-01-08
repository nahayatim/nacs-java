package reflection6;

//The CarApplication creates one Hansel and using the Cars class tries 10 cars.


import java.util.Arrays;
import java.util.List;

public class CarApplication {

    public static void main(String[] args) {

        Hansel hansel = new Hansel();
        Cars cars = new Cars();


        List<String> brandList = Arrays.asList("Audi", "Mercedes", "Seat", "Skoda", "Tesla", "Bmw", "Peugeot", "Citroen", "Jeep", "Ferrari");
        for (String brand : brandList) {
            Car nextCar = cars.getNextCar(brand);
            hansel.haveATry(nextCar);
        }


    }

}
