package exercises.ex01;

//Create a SmallHotAirBalloon, name it smallBalloon and use its liftUp
//and land methods. Notice that the class had no code, but it’s using the
//code from its parent class HotAirBalloon.


public class HotAirBalloonApplication {
    public static void main(String[] args) {
        SmallHotAirBalloon smallBalloon = new SmallHotAirBalloon();
        System.out.println("smallBalloon --");
        smallBalloon.liftUp();
        smallBalloon.land();

        // Create a BigHotAirBalloon, name it bigBalloon and use its liftUp
        //and land methods. Notice that the class had no code, but it’s using
        //the code from its parent class HotAirBalloon.

        BigHotAirBalloon bigBalloon = new BigHotAirBalloon();
        System.out.println("bigBalloon --");
        bigBalloon.liftUp();
        bigBalloon.land();

       //In a new line, assign the variables smallBalloon and bigBalloon
        //to HotAirBalloon variables called small and big respectively.
        //Just use the = symbol.
        System.out.println("small --");
        HotAirBalloon small = smallBalloon;
        small.liftUp();
        small.land();

        System.out.println("big --");
        HotAirBalloon big = bigBalloon;
        big.liftUp();
        big.land();


        //Use both methods from both small and big variables.
        //Notice that now we are using them as HotAirBalloons, exactly the
        //same as if it were an interface. The difference is that the liftUp
        //and land methods are implemented in the abstract and the code is
        //shared among the different classes that extend from it.









    }
}
