package exercises.ex02;

//tests that the Square is working correctly as both Square and Shape.



import exercises.ex01.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void getName(){
        String expected = "square";

        Square square = new Square();
        Assertions.assertEquals(expected,square.getName());


        Shape shape = new Square();
        Assertions.assertEquals(expected,shape.getName());


    }

}