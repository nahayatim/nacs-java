package week2.lecture.classroom;

import java.util.Scanner;

public class ClassroomApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me the student name: ");
        String name = scanner.nextLine();

        Student student = new Student(name);
        Marker blackmarker= new Marker("black");
        student.paint(blackmarker);
       // Student diba = new Student("diba");
        //diba.paint(blackmarker);

        Marker redmarker = new Marker("red");
        student.paint(redmarker);


    }
}
