package reflection;

 //has no attributes. It has the stamp method that receives a letter
//and uses its stamp method. It also has the send method that
//receives a letter, if it is stamped it says they will send it
//to the address it says in the letter; if it is not stamped it says
//they need to stamp it first.


public class PostOfficeAssistant {

    public void stamp(Letter letter){
        letter.stamp();
    }

    public void send(Letter letter){
        if (letter.isStamped()){
            System.out.println("I will send it to: "+letter.getAddress());
        }else {
            System.out.println("You have to stamp it first.");
        }
    }
}
