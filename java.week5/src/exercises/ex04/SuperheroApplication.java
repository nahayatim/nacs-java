package exercises.ex04;

import java.util.ArrayList;
import java.util.List;

public class SuperheroApplication {
    public static void main(String[] args) {

        //Create a SuperheroCaller and use it to call one superhero.
        //Display its name.
        SuperheroCaller caller= new SuperheroCaller();
        Superhero superhero = caller.call();
        System.out.println("Superhero: "+superhero.getName());

        //Create a list of Superhero and add six superheroes by
        //calling them with the SuperheroCaller. Use a lop for this,
        //please.
        List<Superhero>superheroes= new ArrayList<>();
        for (int times=0 ; times<6; times++){
           Superhero hero= caller.call();
           superheroes.add(hero);
            System.out.println("superhero "+ (times+1)+": "+hero.getName());
        }

       //Display the superheroe names one by one with a loop by also
        //showing the number of appearance.
       // Display the number of superheroes by using the list’s size.
        System.out.println("Number of superheroes: "+ superheroes.size());




    }
}
