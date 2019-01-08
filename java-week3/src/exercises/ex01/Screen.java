package exercises.ex01;

//A Screen can display a customer name according to the railway rules,
//and it also returns the name it displayed so that it can be tested afterwards.


public class Screen {

    public void display(Customer customer){
        System.out.println(formatName(customer));

    }

     String formatName(Customer customer) {
        if (customer.getCategory().equalsIgnoreCase("business")){
            return (customer.getName().toUpperCase());
        }
        return (customer.getName().toLowerCase());
    }


}
