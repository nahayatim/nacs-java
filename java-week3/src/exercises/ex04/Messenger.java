package exercises.ex04;
//The Messenger has an encryptor and a decryptor as attributes. It has the send
//method that receives a String, encrypts it and displays the encrypted message.
//It has the receive method that receives a String, decrypts it and displays the
//decrypted message.

public class Messenger {

   private Encryptor encryptor = new Encryptor();
   private Decryptor decryptor = new Decryptor();

   public String send(String message){
       return encryptor.encrypt(message);
   }

   public String recieve(String message){
       return decryptor.decrypt(message);
   }
}
