package exercises.ex02;
// It has the chooseTemplate method that receives a customer and returns
//the word man, woman, privileged or default depending on the insurance
//company’s requirements.

import exercises.ex01.Customer;

public class Templatechooser {


    public String chooseTemplate(Customer customer) {
        if (isPrivilegedTemplate(customer)) {
            System.out.println("privileged");
        }
        if (isManTemplate(customer)) {
            System.out.println("man");
        }
        if (isWomanTemplate(customer)) {
            System.out.println("woman");
        }
        System.out.println( "default");
        return null;
    }

    private Boolean isManTemplate(Customer customer) {
        return customer.getName().trim().startsWith("Mr.");
    }

    private Boolean isWomanTemplate(Customer customer) {
        return (customer.getName().trim().startsWith("Ms.") || customer.getName().trim().startsWith("Mrs."));
    }

    private Boolean isPrivilegedTemplate(Customer customer) {
        return customer.getName().contains("Hokopoko");
    }


}
