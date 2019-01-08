package exercises.ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMakersTest {

    @Test
    void testAutomaticCoffeeMachine() {
        String name = "Automatic coffee machine";
        Optional<CoffeeMaker>maker = CoffeeMakers.get(name);

        Assertions.assertTrue(maker.isPresent());

        Coffee coffee = maker.get().brew();

        Assertions.assertEquals(name, coffee.getMadeBy());
        Assertions.assertEquals(new Integer(5), coffee.getBrewedTime());
    }

    @Test
    void testFrenchPress() {
        String name = "French press";
        Optional<CoffeeMaker> maker = CoffeeMakers.get(name);

        Assertions.assertTrue(maker.isPresent());

        Coffee coffee = maker.get().brew();

        Assertions.assertEquals(name, coffee.getMadeBy());
        Assertions.assertEquals(new Integer(10), coffee.getBrewedTime());
    }
    @Test
    void testAutoDrip() {
        String name = "Auto drip";
        Optional<CoffeeMaker> maker = CoffeeMakers.get(name);

        Assertions.assertTrue(maker.isPresent());

        Coffee coffee = maker.get().brew();

        Assertions.assertEquals(name, coffee.getMadeBy());
        Assertions.assertEquals(new Integer(6), coffee.getBrewedTime());
    }
    @Test
    void testUnknownMaker() {
        String name = "Moka pot";
        Optional<CoffeeMaker> maker = CoffeeMakers.get(name);

        Assertions.assertFalse(maker.isPresent());
    }
}