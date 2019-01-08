package exercises.ex02;

import exercises.ex01.Shape;

public class Triangle implements Shape {

    @Override
    public String getName() {
        return "triangle";
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}
