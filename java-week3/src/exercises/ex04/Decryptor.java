package exercises.ex04;

//The Decryptor has no attributes. It has the decrypt method that receives a
//String and returns the decrypted version of it.


import java.util.Arrays;
import java.util.List;

public class Decryptor {

    public String decrypt (String message){
        message = removeRubbish(message);
        message = replaceNumber(message);
        return message;
    }



    private String removeRubbish(String message) {
        List<String> symbols = Arrays.asList("!@#%&-=" .split(""));
        for (String symbol : symbols) {
            message = message.replaceAll(symbol, "");
        }
            message = message.replaceAll("\\*","");
            message = message.replaceAll("\\+","");
            message = message.replaceAll("\\$","");
            return message;
    }

    private String replaceNumber(String message) {
        message = message.replaceAll("4", "a");
        message = message.replaceAll("3", "e");
        message = message.replaceAll("1", "i");
        message = message.replaceAll("8", "o");
        message = message.replaceAll("9", "u");
        return message;
    }





}
