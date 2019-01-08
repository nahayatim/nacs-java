package exercises.ex04;
//In the HackerApplication class main method, create one String message and a
//Messenger and send and receive it to see the results.


public class HackerApplication {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        String ciphertext = messenger.send("mahtab");
        System.out.println(ciphertext);
        String plaintext = messenger.recieve(ciphertext);
        System.out.println(plaintext);

    }
}
