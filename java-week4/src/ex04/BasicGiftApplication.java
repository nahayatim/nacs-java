package ex04;

import java.util.Optional;

public class BasicGiftApplication {

    public static void main(String[] args) {

        //Create an empty giftBox Optional of String and display it.
        Optional<String>giftBox = Optional.empty();
        System.out.println("Gift: "+ giftBox);

        //Assign an Optional of String to the giftBox containing an actual
        // present and display it.
        giftBox= Optional.of("Robotoy");
        System.out.println("Gift: "+giftBox);

        // Ask if the giftBox is present and display the answer.
        if (giftBox.isPresent()){
            System.out.println("There is a present in the gift box");
        }

        //Get the value contained in giftBox and display it.
        System.out.println("The gift is a "+giftBox.get());




    }
}
