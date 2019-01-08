package ex01.hikingday;

//Define the HikeApplication class that has a main method that uses
// the Hike class to sign up the hikers and show them on the screen.


public class HikeApplication {

    public static void main(String[] args) {
        Hike hike = new Hike();
        hike.signUp();
        hike.showHikers();

    }
}
