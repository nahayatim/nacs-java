package week2.exercises.doorapplication;

public class DoorApplication {

    public static void main(String[] args) {
      Door door= new Door(4);
      Key key = new Key();
      key.open(door);

    }
}
