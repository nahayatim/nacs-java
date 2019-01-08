package exercises.ex01;

public class CircleApplication {

    public static void main(String[] args) {

       // Create a Circle and display its name.
        Circle circle = new Circle();
        String name = circle.getName();
        System.out.println("Class: "+name);

       // In a new line, assign the circle variable to a Shape variable
        //called shape. Just use the = symbol.Display the shape’s name.
        Circle shape = new Circle();
        String name1 = shape.getName();
        System.out.println("Shape: "+name1);

       // Create another Circle, but this time assign it directly to a
        //Shape with the name anotherShape.Display anotherShape’s name.
       Shape anotherShape= new Circle();
        String name2 = anotherShape.getName();
        System.out.println("Another shape: "+name2);


    }
}
