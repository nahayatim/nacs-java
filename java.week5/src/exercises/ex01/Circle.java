package exercises.ex01;

//implements the Shape interface. Implement the getName method with the
//help of Intellij. Return the word circle in that method.


public class Circle implements Shape {

    @Override
    public String getName() {

        return "circle";
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
