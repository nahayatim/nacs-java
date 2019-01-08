package exercises.ex01;

//A Customer has a name and a category. It also has the methods getName
//and getCategory.

public class Customer {

    private String name;
    private String category;

    public Customer(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
