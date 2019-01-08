package exercises.ex04;

 //has a list with the three superheroes. It has the call method that
//returns a random Superhero every time you use it.


import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SuperheroCaller {

    private List<Superhero>superheroes = Arrays.asList(
            new Batman(), new Superman(), new Speiderman());

    private Random random = new Random();

    public Superhero call(){
        int position = random.nextInt(superheroes.size());
        return superheroes.get(position);
    }
}
