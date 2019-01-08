package ex04.restaurant;

import java.util.ArrayList;
import java.util.List;

//There are four meals in the Menu: couscous (8,5 Euro), tajin (9,5 Euro),
//hummus (3,5 Euro) and falafel (4 Euro).The Menu provides the list of Meals.


public class Menu {

    public List<Meal>getMeal(){
        List<Meal>meals = new ArrayList<>();
        meals.add(new Meal("Couscous",8.5));
        meals.add(new Meal("Tajin",9.5));
        meals.add(new Meal("Hummus",3.5));
        meals.add(new Meal("Falafel",4.0));
        return meals;
    }
}
