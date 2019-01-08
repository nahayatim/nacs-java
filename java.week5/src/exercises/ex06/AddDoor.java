package exercises.ex06;

public class AddDoor implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("door");
    }
}
