package ex04.restaurant;

public class Meal {

    private String name;
    private Double price;

    public Meal(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public Double getPrice() {
        return price;
    }

}
