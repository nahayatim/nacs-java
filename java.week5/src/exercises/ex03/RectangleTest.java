package exercises.ex03;

//tests that the Rectangle is working correctly as Rectangle, Colored
//and Shape.


import exercises.ex01.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getName(){
        String expectedName = "rectangle";
        String expectedColor = "blue";

        Rectangle rectangle = new Rectangle();
        assertEquals(expectedName,rectangle.getName());
        assertEquals(expectedColor,rectangle.getColor());

        Shape shape = new Rectangle();
        assertEquals(expectedName,shape.getName());

        Colored colored = new Rectangle();
        assertEquals(expectedColor,colored.getColor());

    }

}