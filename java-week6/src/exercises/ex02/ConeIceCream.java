package exercises.ex02;

// extends the IceCream abstract class. Implement the eat method with the help of Intellij.
//Return a sentence that fulfills the following format: “The <flavor> ice-cream with <topping> is licked”.
//Note that you have no way to access the flavor and topping attributes. This is because they are private.
//Not even classes that extend from it can have access to them. Implement the constructor with the help of
//Intellij. The reason why you’re compelled to implement it is because the IceCream abstract class requires
//those values and because they are requested via the constructor, then all its children classes have to provide
//a constructor to be able to facilitate them.


public class ConeIceCream extends IceCream {

    public ConeIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    public String eat() {
        return "The "+getFlavor() + " ice-cream with "+getTopping()+
                " is licked ";
    }


}
