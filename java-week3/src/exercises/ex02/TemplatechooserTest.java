package exercises.ex02;

import exercises.ex01.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemplatechooserTest {

    Templatechooser templatechooser = new Templatechooser();

    @Test
    void testManTemplate(){
        Customer mrerison = new Customer("Mr. Erison", "business");
        String mrerisonTemplate = templatechooser.chooseTemplate(mrerison);
        Assertions.assertEquals("man",mrerisonTemplate);

    }

    @Test
    void testWomanTemplate(){
        Customer mrssmith = new Customer("Mrs. Smith", "economic");
        String mrssmithTemplate = templatechooser.chooseTemplate(mrssmith);
        Assertions.assertEquals("woman",mrssmithTemplate);
    }

    @Test
    void testPrivilegedTemplate(){
        Customer mrJackson = new Customer("Mr. Jones Jackson Hokopoko", "privileged");
        String mrJacksonTemplate = templatechooser.chooseTemplate(mrJackson);
        Assertions.assertEquals("privileged", mrJacksonTemplate);

    }

    @Test
    void testDefaultTemplate(){
        Customer mrBoring = new Customer("Boring Bob", "privileged");
        String mrBoringTemplate = templatechooser.chooseTemplate(mrBoring);
        Assertions.assertEquals("default", mrBoringTemplate);

    }

}