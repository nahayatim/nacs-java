package robomime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AndDecryptor implements Decryptor {

    @Override
    public Boolean isContain(String line) {
        return line.contains("&");
    }

    @Override
    public String decrypt(String line) {
        String replace = line.replace("&", "");
        String reversed = new StringBuilder().reverse().toString();
        /*String[] split = replace.split("");
        List<String> letters = new ArrayList<>(Arrays.asList(split));
        Collections.reverse(letters);
        String reversed = "";
        for (String letter : letters) {
            reversed += letter;
        }*/
        return reversed;


    }
}
