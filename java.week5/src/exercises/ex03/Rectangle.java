package exercises.ex03;

//Add the Shape interface to the Rectangle class. Don’t replace Colored.
//Just place a comma after Colored and add Shape right afterwards.
//Implement the getName method with the help of Intellij.

import exercises.ex01.Shape;

public class Rectangle implements Colored, Shape {

    @Override
    public String getColor() {
        return "blue";
    }

    @Override
    public String getName() {
        return "rectangle";
    }

    //Add the toString method to the Rectangle. Make sure you use its
    //interface methods to return its color and name as a String.

    @Override
    public String toString() {
        return getColor()+" "+getName();
    }
}
