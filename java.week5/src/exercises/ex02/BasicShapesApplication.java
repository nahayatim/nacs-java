package exercises.ex02;

import exercises.ex01.Circle;
import exercises.ex01.Shape;

import java.util.ArrayList;
import java.util.List;

public class BasicShapesApplication {
    public static void main(String[] args) {

        //Create a Circle as a Shape, name it circle and display its name.
        Shape circle = new Circle();
        System.out.println("Shape: "+circle.getName());

        //Create a Square as a Shape, name it square and display its name.
        Shape square = new Square();
        System.out.println("Shape: "+square.getName());

       //Create a Triangle as a Shape, name it triangle and display its name.
        Shape triangle = new Triangle();
        System.out.println("Shape: "+ triangle.getName());

       //Create a list of Circle named circles and try to add circle,
        //square and triangle to it. It doesn’t work because circle is
        //not a Circle now, it is a Shape, and it’s not the same. Also,
        //square and triangle don’t work either because they are not
        //Circles.
        List<Circle>circles =new ArrayList<>();
       // circles.add(circle);
        // circles.add(square);
        //circles.add(triangle);
        //Doesn't work

        //Create a list of Shape named shapes and add circle to it.
        //Try to add square and triangle as well. It works because the
        //three of them are shapes.
        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(triangle);

        //Display the list. It shows memory addresses. Implement the
        //toString methods in each one of the three Shapes returning
        //the name of the shape itself by reusing the interface method.
        //Display it now.
        System.out.println("Shapes: "+shapes);

       //Use a foreach loop to go through all the shapes and one by one
        //display its names.
        for (Shape shape : shapes) {
            System.out.println("Shape name: "+shape.getName());
        }








    }
}
