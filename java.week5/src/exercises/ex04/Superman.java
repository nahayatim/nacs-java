package exercises.ex04;

import exercises.ex05.Villain;

public class Superman implements Superhero {

    @Override
    public String getName() {
        return "Superman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(getName());
    }

    @Override
    public String toString() {
        return "Superman";
    }
}
