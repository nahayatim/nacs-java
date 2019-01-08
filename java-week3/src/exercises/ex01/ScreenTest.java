package exercises.ex01;
//Create the ScreenTest class and test its behavior. Write three methods:
//testBusinessCustomer, testEconomicCustomer and testOtherCustomer


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScreenTest {

    Screen screen = new Screen();

    @Test
    void testBusinessCustomer(){
        Customer edison = new Customer("edison", "business");
        String edisonFormat = screen.formatName(edison);
        Assertions.assertEquals("EDISON",edisonFormat);

    }

    @Test
    void testEconomicCustomer(){
        Customer jack = new Customer("jack", "economic");
        String jackFormat = screen.formatName(jack);
        Assertions.assertEquals("jack",jackFormat);
    }

}