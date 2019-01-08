package ex04.restaurant;

//The Waiter has access to the menu (through the constructor)
// and can show the list of Meals


import java.util.List;

public class Waiter {

    Menu menu = new Menu();

    public Waiter(Menu menu) {
        this.menu = menu;
    }

    public List<Meal> getMeals(){
        return menu.getMeal();
    }

    // The Waiter can receive one order from a customer
    // (typing the name of the desired Meal), then the Waiter will show
    //how much the customer has to pay for that Meal.

    public void ShowPrice(String mealName){
        List<Meal>meals = menu.getMeal();
        for (Meal meal : meals) {
            if (meal.getName().equals(mealName)) {
                System.out.println("The price of "+ mealName + " is " + meal.getPrice()+ " Euros");
                return;
            }
        }

    }

}
