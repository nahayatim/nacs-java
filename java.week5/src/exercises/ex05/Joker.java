package exercises.ex05;

//It has the lives attribute that starts with the value ten. In its weaken
//method, display the message “Damn you, <Superhero’s name>! You managed to
//weaken me!” and subtract one from his lives counter. If his lives reaches
//zero, he displays the message “You all defeated me! But I will be back!”.


import exercises.ex04.Superhero;

public class Joker implements Villain  {

    private Integer lives = 10;

    @Override
    public void weaken(String name) {
        System.out.println("Damn you, "+ name+ "! You managed to weaken me!");
        lives--;
        if (lives.equals(0)){
            System.out.println("You all defeated me! But I will be back!");

        }

    }
}
