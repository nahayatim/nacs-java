package reflection;

//class main method, create a Letter and a PostOfficeAssistant,
//and use it to stamp the letter and then send it.
//create three letters and a Postman with them, and use it to deliver
//all the letters.


import java.util.ArrayList;
import java.util.List;

public class PostOfficeApplication {

    public static void main(String[] args) {

        Letter letter = new Letter("mm");
        PostOfficeAssistant postOfficeAssistant = new PostOfficeAssistant();
        postOfficeAssistant.stamp(letter);
        postOfficeAssistant.send(letter);

        List<Letter>letters = new ArrayList<>();
       letters.add(new Letter("Street 22"));
       letters.add(new Letter("Street 87"));
       letters.add(new Letter("Street 92"));

        Postman postman = new Postman(letters);
        postman.deliver();




    }
}
