package ex04.restaurant;

//has the main method that uses the Waiter class to show the different Meals
// and takes one order from one customer.


import java.util.List;

public class RestaurantApplication {

    public static void main(String[] args) {

        Waiter waiter = new Waiter(new Menu());

        List<Meal>meals = waiter.getMeals();
        for (Meal meal : meals) {
            System.out.println("Meal: " + meal.getName());
            System.out.println(""+ meal.getPrice()+ " Euros");

        }
        waiter.ShowPrice("Hummus");


    }
}

