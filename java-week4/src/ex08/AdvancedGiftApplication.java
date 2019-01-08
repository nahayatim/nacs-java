package ex08;

import java.util.Optional;

public class AdvancedGiftApplication {
    public static void main(String[] args) {

        //Create an empty giftBox Optional of Box and display it.
        Optional<Box>giftBox = Optional.empty();
        System.out.println("Gift: "+giftBox);

        //Create a Box with a present name as content.
        Box robotoy = new Box("Robotoy");

        //Assign an Optional of Box to the giftBox containing the previous Box
        //and display it.
        giftBox = Optional.of(robotoy);
        System.out.println("Gift: "+giftBox);

        //Ask if the giftBox is present and display the answer.
        if (giftBox.isPresent()){
            System.out.println("There is a present in the gift box");
        }

        //Get the value contained in giftBox and display it. To display the
        //Box class create the toString method.
        Box box = giftBox.get();
        System.out.println("The gift is a "+box);

    }
}
