package exercises.ex01;

//create a business class Customer, an economic class Customer,
//a Screen and display them the screen.


public class ScreenApplication {
    public static void main(String[] args) {

        Customer alex = new Customer("alex", "business");
        Customer maria = new Customer("maria", "economic");

        Screen screen = new Screen();

        screen.display(alex);
        screen.display(maria);
    }
}
