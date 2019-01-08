package exercises.ex04;

import exercises.ex05.Villain;

public class Speiderman implements Superhero {

    @Override
    public String getName() {
        return "Speiderman";
    }

    @Override
    public void fight(Villain villain) {

        villain.weaken(getName());
    }

    @Override
    public String toString() {
        return "Speiderman";
    }
}
