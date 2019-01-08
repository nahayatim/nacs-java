package exercises.ex02;
//In the InsuranceApplication class main method, create several
//Customers and a TemplateChooser and see the results.


import exercises.ex01.Customer;

public class InsuranceApplication {
    public static void main(String[] args) {

        Templatechooser templatechooser = new Templatechooser();

        Customer Sisi = new Customer("Mrs. sisi", "business");
        Customer MsHappy = new Customer("Ms. Happy", "economy");
        Customer MrRabins = new Customer("Mr. Rabins", "business");
        Customer hokopoko = new Customer("Ms. Hokopoko", "business");



        templatechooser.chooseTemplate(Sisi);
        templatechooser.chooseTemplate(MsHappy);
        templatechooser.chooseTemplate(MrRabins);
        templatechooser.chooseTemplate(hokopoko);


    }


}
