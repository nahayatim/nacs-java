package exercises.ex05;

//Create a SuperheroCaller. Reuse the one from exercise 4.
//Create one Joker.
//Use the SuperheroCaller ten times to call one superhero and make him fight
//the joker.

import exercises.ex04.Superhero;
import exercises.ex04.SuperheroCaller;

public class AdvancedSuperheroApplication {
    public static void main(String[] args) {

        SuperheroCaller caller = new SuperheroCaller();
        Joker joker =new Joker();
        for (int times=0 ; times<10 ;times++){
            Superhero superhero = caller.call();
            superhero.fight(joker);
        }



    }
}
