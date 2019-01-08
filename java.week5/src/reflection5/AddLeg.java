package reflection5;

import exercises.ex06.Furniture;
import exercises.ex06.Step;

public class AddLeg implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("leg");
    }
}
