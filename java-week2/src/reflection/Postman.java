package reflection;

//has a list of Letter. It has the deliver method that goes through
//all the letters he has and one by one, says that he delivered it to its
//address and removes it from his list (until there are no more letters left).


import java.util.ArrayList;
import java.util.List;

public class Postman {

    private List<Letter>letters;

    public Postman(List<Letter> letters) {
        this.letters = letters;
    }

    public void deliver(){
        while (!letters.isEmpty()){
            deliverOneLetter();
        }

    }

    private void deliverOneLetter() {
        Letter letter = letters.get(0);
        letters.remove(0);
        System.out.println("Letter delivered to: "+ letter.getAddress());
    }

}
