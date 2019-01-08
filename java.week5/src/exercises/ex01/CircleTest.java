package exercises.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getName() {
        Circle circle = new Circle();
        String name = circle.getName();
        Assertions.assertEquals("circle",name);

        Shape shape = new Circle();
        assertEquals("circle",shape.getName());
    }
}