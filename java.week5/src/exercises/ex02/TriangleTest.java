package exercises.ex02;

//tests that the Triangle is working correctly as both Triangle and
//Shape.

import exercises.ex01.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getName(){
        String expected = "triangle";

        Triangle triangle = new Triangle();
        Assertions.assertEquals(expected,triangle.getName());

        Shape shape = new Triangle();
        Assertions.assertEquals(expected,shape.getName());
    }



}