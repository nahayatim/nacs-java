package exercises.ex04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperheroCallerTest {

    private SuperheroCaller caller = new SuperheroCaller();

    @Test
    void call(){
        Superhero superhero = caller.call();

        assertNotNull(superhero);

        String name = superhero.getName();
        String options = "Batman Superman Speiderman";
        assertTrue(options.contains(name));

    }

}