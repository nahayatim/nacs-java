package exercises.ex06;

public class AddSide implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("side");
    }
}
