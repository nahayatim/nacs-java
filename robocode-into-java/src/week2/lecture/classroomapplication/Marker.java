package week2.lecture.classroomapplication;

public class Marker {

    private String color;

    public Marker(String color){
        this.color=color;
    }

    public void paint(){
        System.out.println("Marker paints in "+ color);
    }


}
