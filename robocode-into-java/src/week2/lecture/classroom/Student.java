package week2.lecture.classroom;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void paint(Marker marker){
        System.out.println(name + " paints");
        marker.paint();

    }
}
