package exercises.ex03;

import exercises.ex01.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicColorApplication {
    public static void main(String[] args) {

        //Create a Rectangle as a normal Rectangle, name it rectangle
        //and display its color.
        //Display the rectangle’s name.

        Rectangle rectangle = new Rectangle();
        System.out.println("Color: "+rectangle.getColor());
        System.out.println("Name: "+rectangle.getName());

       //In a new line, write the following: Colored colored = (Colored)
        //rectangle; This is called casting. Now the rectangle is no
        //longer a Rectangle, but it is a Colored object. Display its
        //color. Note that you cannot see any more the getName method
        //because the Colored interface does not have it.
        Colored colored = (Colored) rectangle;
        System.out.println("Colored: "+colored.getColor());

        //In a new line, write the following:  Shape shape = (Shape)
        //rectangle; This is called casting. Now the rectangle is no
        //longer a Rectangle, but it is a Shape object. Display its
        //name. Note that you cannot see any more the getColor method
        //because the Shape interface does not have it.
        Shape shape = (Shape) rectangle;
        System.out.println("Shape: "+shape.getName());

        //Create a list of Rectangle called rectangles and add the
        //rectangle. Note that you cannot add either colored or shape
        //because they are not Rectangles.
        List<Rectangle> rectangles = Arrays.asList(rectangle);
        //or rectangles.add(rectangle);

        //Create a list of Colored called coloreds and add rectangle
        //and colored to it. Note that you cannot add shape because
        //it’s not a Colored object.
        List<Colored> coloreds = Arrays.asList(rectangle,colored);
        //coloreds.add(rectangle);
        //coloreds.add(colored);


        //Create a list of Shape called shapes and add rectangle and
        //shape to it. Note that you cannot add colored because it’s not
        //a Shape object.
        List<Shape> shapes = Arrays.asList(rectangle,shape);
        //shapes.add(rectangle);
        //shapes.add(shape);


        System.out.println(rectangles);
        System.out.println(coloreds);
        System.out.println(shapes);











    }
}
