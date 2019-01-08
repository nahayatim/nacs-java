package exercises.ex02.competitor;
//Create both a ConeIceCream and a CupIceCream and check whether you can use the
//getFlavor or getTopping methods. It doesn’t work because the CompetitorIceCreamApplication
//is in a different package and it also does not extend from IceCream, therefore the
//protected methods are not accessible.


import exercises.ex02.ConeIceCream;
import exercises.ex02.CupIceCream;

public class CompetitorIceCreamApplication {
    public static void main(String[] args) {

        ConeIceCream cone = new ConeIceCream("chocolate","oreo");
       // cone.getFlavor()
        //cone.getTopping()
        //it doesn't work
        CupIceCream cup = new CupIceCream("strawberry", "pistachio");
        //cup.getFlavor()
        //cup.getTopping()
        //it doesn't work
    }
}
