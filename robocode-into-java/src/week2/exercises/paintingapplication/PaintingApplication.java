package week2.exercises.paintingapplication;

public class PaintingApplication{

  public static void main(String[]args){

     Derek derek= new Derek();
     derek.hangPainting();

     Tool hammer= new Tool("Hammer");
     derek.setTool(hammer);
     derek.hangPainting();

        }
}
