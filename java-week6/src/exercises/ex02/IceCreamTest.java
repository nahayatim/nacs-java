package exercises.ex02;

//Create the IceCreamTest class that tests that the ConeIceCream and the CupIceCream
//return the right messages.Create the competitor package and inside of it the
//CompetitorIceCreamApplication class and write the following instructions in its
//main method:


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IceCreamTest {

    @Test
    void testConeIceCream(){
        IceCream cone = new ConeIceCream("Chocolate", "Oreo");
        String expected = " The Chocolate ice-cream with Oreo is licked ";
        Assertions.assertEquals(expected,cone.eat());
    }

    @Test
    void testCupIceCream(){
        IceCream cup = new CupIceCream("Vanilla", "Cookies");
        String expected = "The Vanilla ice-cream with Cookies is eaten with a spoon";
        Assertions.assertEquals(expected,cup.eat());

    }





}