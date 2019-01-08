package week2.exercises.carshopapplication;

public class CarShopApplication {

    public static void main(String[] args) {

        Seller seller= new Seller();

        Car bmw = new Car("BMW");
        Car volvo = new Car("VOLVO");
        Car audi = new Car("AUDI");

        seller.describe(bmw);
        seller.describe(volvo);
        seller.describe(audi);

    }
}
