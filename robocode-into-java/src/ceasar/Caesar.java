package ceasar;

import java.util.Arrays;
import java.util.List;

public class Caesar {

    public String encrypt(String plaintext, Integer key){

        String ciphertext="";
        String[] split = plaintext.split("");
        List<String>letters= Arrays.asList(split);

        for (String letter : letters) {
            int asciiCode = toAscii(letter);
            if (Character.isAlphabetic(asciiCode)){
              //  cha
            }


        }






        return ciphertext;
    }

    public int toAscii(String letter) {
        char character = letter.charAt(0);
        int asciiCode = character;
        return asciiCode;
    }

}
