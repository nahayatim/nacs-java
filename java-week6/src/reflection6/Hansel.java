package reflection6;

//The Hansel class has the haveATry method that receives a Car and drives it
//to display the following message “I love this <car kind> <brand>”.


public class Hansel {

    public void haveATry(Car car){
        String message = car.drive();
        System.out.println("I love this "+message);
    }

}
