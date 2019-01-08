package week2.lecture.classroomapplication;

import week2.lecture.classroomapplication.Marker;

public class Student {

    private String name;

    public Student(String name){
        this.name=name;
    }

    public void paint(Marker marker){
        System.out.println(name+ " paints");
        marker.paint();
    }
}
