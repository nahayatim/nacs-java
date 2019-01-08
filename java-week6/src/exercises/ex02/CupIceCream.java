package exercises.ex02;

//Create the CupIceCream class that extends the IceCream abstract class. Implement
// the eat method with the help of Intellij. Return a sentence that fulfills the
//following format: “The <flavor> ice-cream with <topping> is eaten with a spoon”.
//Implement the constructor with the help of Intellij. The reason why you’re compelled
//to implement it is because the IceCream abstract class requires those values and
//because they are requested via the constructor, then all its children classes have
//to provide a constructor to be able to facilitate them.

public class CupIceCream extends IceCream{


    public CupIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    public String eat() {
        return "The "+ getFlavor()+" ice-cream with " +getTopping()
                +" is eaten with a spoon";
    }
}
